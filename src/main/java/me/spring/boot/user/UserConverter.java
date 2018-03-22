package me.spring.boot.user;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Byungwook Lee on 2018-03-23
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
// 방법 3
// @Component
public class UserConverter implements Converter<String, User> {

	@Override
	public User convert(String source) {
		User user = new User();
		user.setName(source);
		return user;
	}
}
