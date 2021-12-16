package com.coforge.training.crm.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.*;

@Entity
@Table(name="customer") //User Class Mapped With Customer Table for Login Implementation
public class User {
	
	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;

	@Id
	@Column(name="id")
	private String id;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
			
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = password;
		String encodedString = encoder.encodeToString(
		normalString.getBytes(StandardCharsets.UTF_8) );
		this.password = encodedString;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
