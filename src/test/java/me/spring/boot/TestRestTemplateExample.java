package me.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Byungwook Lee on 2018-03-25
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class TestRestTemplateExample {
	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void testRestTemplateTest() {
		String response = testRestTemplate.getForObject("/foo", String.class);

		assertThat(response).isEqualTo("Hello");
	}
}
