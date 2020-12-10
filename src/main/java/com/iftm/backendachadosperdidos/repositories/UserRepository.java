package com.iftm.backendachadosperdidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.backendachadosperdidos.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
