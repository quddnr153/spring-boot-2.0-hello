package me.spring.boot.user;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sun.awt.image.ImageWatched;

/**
 * @author Byungwook Lee on 2018-03-21
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class UserController {
	@Autowired
	List<HttpMessageConverters> converters;

	@GetMapping("/user")
	public User currentUser() {
		User user = new User();

		user.setName("week");
		user.setAge(29);
		user.setHeight(180);

		return user;
	}

	@GetMapping("/user/{id}")
	public User user(@PathVariable("id") User user) {
		if (user.getName().equals("test")) {
			throw new IllegalStateException();
		}
		return user;
	}

	@GetMapping("/user/resource/{id}")
	public UserResource userResource(@PathVariable("id") User user) {
		UserResource resource = new UserResource();
		resource.setContent(user.getName() + " hi.");

		Link link = linkTo(UserController.class).slash("user").slash(user.getName()).withRel("userList");

		resource.add(link);

		return resource;
	}

	@ExceptionHandler
	public ResponseEntity<String> handleException(Exception exception) {
		return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
	}
}
