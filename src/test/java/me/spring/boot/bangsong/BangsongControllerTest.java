package me.spring.boot.bangsong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Byungwook Lee on 2018-03-24
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BangsongControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void exampleTest() {
		String body = restTemplate.getForObject("/foo", String.class);
		assertThat(body).isEqualTo("Hello");
	}

	@Test
	public void mockTest() throws Exception {
		System.out.println("===========PORT=============");
		System.out.println(port);

		assertThat(mockMvc).isNotNull();
		mockMvc.perform(get("/bs"))
				.andExpect(status().isOk())
				.andDo(print());
	}
}