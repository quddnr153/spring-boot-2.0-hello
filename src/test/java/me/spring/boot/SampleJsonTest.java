package me.spring.boot;

import me.spring.boot.user.User;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

/**
 * @author Byungwook Lee on 2018-03-25
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public class SampleJsonTest {
	JacksonTester<Sample> sampleJsonTester;

	JacksonTester<User> userJsonTester;

	@Before
	public void setUp() {
		JacksonTester.initFields(this, new ObjectMapper());
	}

	@Test
	public void jacksonTestIsNotNull() {
		assertThat(userJsonTester).isNotNull();
	}

	@Test
	public void jsonTest() throws IOException {
		Sample sample = new Sample();
		sample.setName("BW");
		sample.setNumber(100);

		JsonContent<Sample> sampleJsonContent = sampleJsonTester.write(sample);

		assertThat(sampleJsonContent)
				.hasJsonPathStringValue("@.name")
				.extractingJsonPathStringValue("@.name").isEqualTo("BW");

		assertThat(sampleJsonContent)
				.hasJsonPathNumberValue("@.number")
				.extractingJsonPathNumberValue("@.number").isEqualTo(100);
	}
}
