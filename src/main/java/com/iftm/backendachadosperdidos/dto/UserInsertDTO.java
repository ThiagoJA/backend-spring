package com.iftm.backendachadosperdidos.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.iftm.backendachadosperdidos.entities.User;
import com.iftm.backendachadosperdidos.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO implements Serializable {
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
	
	@NotEmpty(message = "can't be empty")
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
