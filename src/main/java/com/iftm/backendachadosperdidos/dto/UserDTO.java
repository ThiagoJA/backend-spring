package com.iftm.backendachadosperdidos.dto;

import com.iftm.backendachadosperdidos.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	private String email;
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