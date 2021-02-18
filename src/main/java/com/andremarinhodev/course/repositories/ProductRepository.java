package com.andremarinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremarinhodev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
