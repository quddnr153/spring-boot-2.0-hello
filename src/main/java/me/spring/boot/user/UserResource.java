/**
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package me.spring.boot.user;

import org.springframework.hateoas.ResourceSupport;

import lombok.Data;

/**
 * @author Byungwook Lee
 */
@Data
public class UserResource extends ResourceSupport {
	private String content;
}
