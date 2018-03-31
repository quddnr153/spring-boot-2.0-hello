package me.spring.boot.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Byungwook Lee on 2018-03-31
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Data
@Entity
public class Meeting {
	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String title;
	private String location;
}
