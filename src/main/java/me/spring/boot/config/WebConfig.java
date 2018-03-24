package me.spring.boot.config;

import me.spring.boot.user.UserConverter;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
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

	// 방법 1: 하지말자
//	@Bean
//	public ConfigurableWebBindingInitializer initializer() {
//		ConfigurableWebBindingInitializer initializer = new ConfigurableWebBindingInitializer();
//		ConfigurableConversionService configurableConversionService = new FormattingConversionService();
//		configurableConversionService.addConverter(new UserConverter());
//		initializer.setConversionService(configurableConversionService);
//		return initializer;
//	}

	// 방법 2: 이것 또는 Converter 자체를 bean 으로 등록하자
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new UserConverter());
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/bs");
	}
}
