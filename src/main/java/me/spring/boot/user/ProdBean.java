/**
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package me.spring.boot.user;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Byungwook Lee
 */
@Component
@Profile("production")
public class ProdBean implements MyBean {
	@Override
	public String getMessage() {
		return "Production Bean";
	}
}
