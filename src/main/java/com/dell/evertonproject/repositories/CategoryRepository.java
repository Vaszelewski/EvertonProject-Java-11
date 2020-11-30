package com.dell.evertonproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dell.evertonproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
