package me.spring.boot.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author Byungwook Lee on 2018-03-27
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/*.html").permitAll() // 1번 방법
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.requestMatchers(new AntPathRequestMatcher("/hello.html")).permitAll() // 2번 방법
				.anyRequest().fullyAuthenticated()
				.and()
				.formLogin().permitAll()
				.and()
				.logout().permitAll();
	}
}
