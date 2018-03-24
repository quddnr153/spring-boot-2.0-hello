package me.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee on 2018-03-24
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class FooController {
	@Autowired
	private SampleService sampleService;

	@RequestMapping("/foo")
	public String foo() {
		return "Hello";
	}

	@RequestMapping("/sample")
	public String sample() {
		return sampleService.getName();
	}
}
