package me.spring.boot.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
		return user;
	}
}
