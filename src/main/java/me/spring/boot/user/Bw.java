/**
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package me.spring.boot.user;

import java.time.Duration;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author Byungwook Lee
 */
public class Bw {
	@NotEmpty
	private String whereToGo;
	@Min(10)
	@Max(20)
	private int time;
	private Duration milliSec;

	public String getWhereToGo() {
		return whereToGo;
	}

	public void setWhereToGo(String whereToGo) {
		this.whereToGo = whereToGo;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Duration getMilliSec() {
		return milliSec;
	}

	public void setMilliSec(Duration milliSec) {
		this.milliSec = milliSec;
	}
}
