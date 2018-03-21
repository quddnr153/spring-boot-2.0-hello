package me.spring.boot.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * HandlerMapping, HandlerAdapter, ExceptionHandler -> WebMvcRegistrations
 * 기타 등등 => WebMvcConfigurer
 *
 * @author Byungwook Lee on 2018-03-21
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Bean
	public HttpMessageConverters customMessageConverter() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		return new HttpMessageConverters(converter);
	}
}
