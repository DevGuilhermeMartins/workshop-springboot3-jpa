package com.guilherme.s.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.s.springproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
