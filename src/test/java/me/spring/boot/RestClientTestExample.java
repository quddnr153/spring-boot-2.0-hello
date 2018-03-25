package me.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

/**
 * @author Byungwook Lee on 2018-03-25
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RunWith(SpringRunner.class)
@RestClientTest(SampleService.class)
public class RestClientTestExample {
	@Autowired
	private SampleService sampleService;

	@Autowired
	private MockRestServiceServer server;

	@Test
	public void restTemplateTest() {
		server.expect(requestTo("/foo"))
				.andRespond(withSuccess("hello", MediaType.TEXT_PLAIN));

		String actual = sampleService.getRestTemplateData();

		assertThat(actual).isEqualTo("hello");
	}
}
