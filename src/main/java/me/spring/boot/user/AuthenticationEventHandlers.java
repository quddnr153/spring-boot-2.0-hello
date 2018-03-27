package me.spring.boot.user;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

/**
 * @author Byungwook Lee on 2018-03-27
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Component
public class AuthenticationEventHandlers {
	@EventListener
	public void handleBadCredential(AuthenticationFailureBadCredentialsEvent event) {
		System.out.println(event.getAuthentication().getPrincipal() + " 인증 시도중...");
		System.out.println("비번 틀림");
	}
}
