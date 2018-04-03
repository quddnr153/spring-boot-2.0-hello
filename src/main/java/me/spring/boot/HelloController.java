/**
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package me.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
