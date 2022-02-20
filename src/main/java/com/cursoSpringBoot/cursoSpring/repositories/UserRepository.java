package com.cursoSpringBoot.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpringBoot.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
