package me.spring.boot;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Byungwook Lee on 2018-03-24
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class SampleService {
	private RestTemplate restTemplate;

	public SampleService(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	public String getName() {
		return "Remote Service";
	}

	public String getRestTemplateData() {
		return restTemplate.getForObject("/foo", String.class);
	}
}
