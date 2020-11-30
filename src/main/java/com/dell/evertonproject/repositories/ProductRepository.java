package com.dell.evertonproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dell.evertonproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
