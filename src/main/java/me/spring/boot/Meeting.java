package me.spring.boot;

import lombok.Data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * @author Byungwook Lee on 2018-03-31
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Data
@RedisHash("Meetings")
public class Meeting {
	@Id
	private String id;
	private String title;
	private Date startAt;
}
