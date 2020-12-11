package com.iftm.backendachadosperdidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.backendachadosperdidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
