package com.guilherme.s.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.s.springproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
