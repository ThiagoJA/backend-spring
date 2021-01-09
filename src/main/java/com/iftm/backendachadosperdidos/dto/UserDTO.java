package com.iftm.backendachadosperdidos.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.iftm.backendachadosperdidos.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotEmpty(message = "can't be empty")
	@Length(min = 5, max = 80, message = "Length must be between 5 and 80")
	private String name;
	
	@NotEmpty(message = "can't be empty")
	@Email
	private String email;
	
	@NotEmpty(message = "can't be empty")
	@Length(min = 8, max = 20, message = "Length must be between 8 and 20")
	private String telefone;
	private String cpf;

	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email, String telefone, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public UserDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.telefone = entity.getTelefone();
		this.cpf = entity.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public User toEntity() {
		return new User(id, name, email, telefone, null, cpf);
	}
}