package me.spring.boot.user;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author Byungwook Lee on 2018-03-21
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public class User {
	@NotEmpty
	private String name;
	@Max(110)
	@Min(0)
	private int age;
	@Min(50)
	@Max(300)
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
