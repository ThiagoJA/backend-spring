package com.iftm.backendachadosperdidos.dto;

import java.io.Serializable;

import com.iftm.backendachadosperdidos.entities.User;

public class UserInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	private String telefone;
	private String senha;
	private String cpf;

	public UserInsertDTO() {
	}

	public UserInsertDTO(Long id, String name, String email, String telefone, String senha, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.cpf = cpf;
	}

	public UserInsertDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.telefone = entity.getTelefone();
		this.senha = entity.getSenha();
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public User toEntity() {
		return new User(id, name, email, telefone, senha, cpf);
	}
}
