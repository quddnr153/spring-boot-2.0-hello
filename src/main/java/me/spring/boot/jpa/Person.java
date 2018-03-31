package me.spring.boot.jpa;

import lombok.Data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.UniqueElements;

/**
 * @author Byungwook Lee on 2018-03-31
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Data
@Entity
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String email;
	private String name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date joined;
}
