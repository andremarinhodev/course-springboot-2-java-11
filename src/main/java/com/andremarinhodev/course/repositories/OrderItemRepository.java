package com.andremarinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremarinhodev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
