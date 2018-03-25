package me.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Byungwook Lee on 2018-03-25
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RunWith(SpringRunner.class)
@WebMvcTest
public class SampleWebMvcTest {
	@Autowired
	MockMvc mockMvc;

	@MockBean
	SampleService sampleService;

	@Test
	public void testFoo() throws Exception {
		given(sampleService.getName()).willReturn("BW");

		mockMvc.perform(get("/sample"))
				.andExpect(handler().handlerType(FooController.class))
				.andExpect(handler().methodName("sample"))
				.andExpect(status().isOk())
				.andExpect(content().string("BW"));
	}
}
