package com.guilherme.s.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.s.springproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
