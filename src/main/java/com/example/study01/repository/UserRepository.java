package com.example.study01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.study01.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
