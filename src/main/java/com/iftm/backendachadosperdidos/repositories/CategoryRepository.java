package com.iftm.backendachadosperdidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.backendachadosperdidos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
