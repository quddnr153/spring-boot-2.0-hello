package me.spring.boot.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RequestMapping;
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

	/**
	 * "main" -> ViewResolver* -> View -> ContentNegotiatingViewResolver -> View
	 *
	 * @return view
	 */
	@RequestMapping("/")
	public String index() {
		converters.forEach(c -> c.getConverters().forEach(e -> System.out.println(e.getClass())));

		return "Hello";
	}
}
