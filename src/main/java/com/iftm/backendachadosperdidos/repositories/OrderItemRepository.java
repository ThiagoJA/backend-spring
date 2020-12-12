package com.iftm.backendachadosperdidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.backendachadosperdidos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
