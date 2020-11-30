package com.dell.evertonproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dell.evertonproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
