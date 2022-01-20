package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "jpatest")
public class UserDTO {

	@Id
	@GenericGenerator(name = "abc", strategy = "native")
	@GeneratedValue(generator = "abc")
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	public UserDTO() {

	}

	public UserDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
