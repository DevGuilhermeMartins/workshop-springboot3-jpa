package com.guilherme.s.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.s.springproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
