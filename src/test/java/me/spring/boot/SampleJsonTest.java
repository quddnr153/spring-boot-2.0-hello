package me.spring.boot;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

/**
 * @author Byungwook Lee on 2018-03-25
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RunWith(SpringRunner.class)
@JsonTest
public class SampleJsonTest {
	@Autowired
	JacksonTester<Sample> json;

	@Test
	public void jsonTest() throws IOException {
		Sample sample = new Sample();
		sample.setName("BW");
		sample.setNumber(100);

		JsonContent<Sample> sampleJsonContent = json.write(sample);

		assertThat(sampleJsonContent)
				.hasJsonPathStringValue("@.name")
				.extractingJsonPathStringValue("@.name").isEqualTo("BW");

		assertThat(sampleJsonContent)
				.hasJsonPathNumberValue("@.number")
				.extractingJsonPathNumberValue("@.number").isEqualTo(100);
	}
}
