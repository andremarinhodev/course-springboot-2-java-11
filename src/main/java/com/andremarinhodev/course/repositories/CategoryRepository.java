package com.andremarinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremarinhodev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
