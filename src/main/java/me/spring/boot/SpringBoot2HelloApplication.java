package me.spring.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import me.spring.boot.user.Bw;

@SpringBootApplication
public class SpringBoot2HelloApplication {

	@Bean
	@ConfigurationProperties(prefix = "bw")
	public Bw bw() {
		return new Bw();
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBoot2HelloApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
