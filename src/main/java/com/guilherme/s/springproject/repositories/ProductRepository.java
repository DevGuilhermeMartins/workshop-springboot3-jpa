package com.guilherme.s.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.s.springproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
