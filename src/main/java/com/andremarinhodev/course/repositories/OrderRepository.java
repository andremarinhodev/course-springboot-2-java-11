package com.andremarinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremarinhodev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
