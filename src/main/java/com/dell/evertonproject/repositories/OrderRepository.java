package com.dell.evertonproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dell.evertonproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
