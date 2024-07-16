package com.java.springboot.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.springboot.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
