package me.spring.boot;

import org.springframework.stereotype.Service;

/**
 * @author Byungwook Lee on 2018-03-24
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class SampleService {
	public String getName() {
		return "Remote Service";
	}
}
