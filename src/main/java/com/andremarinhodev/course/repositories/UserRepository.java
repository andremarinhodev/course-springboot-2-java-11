package com.andremarinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremarinhodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
