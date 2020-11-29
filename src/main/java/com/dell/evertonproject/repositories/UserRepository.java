package com.dell.evertonproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dell.evertonproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
