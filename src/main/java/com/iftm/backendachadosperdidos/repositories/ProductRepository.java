package com.iftm.backendachadosperdidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.backendachadosperdidos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
