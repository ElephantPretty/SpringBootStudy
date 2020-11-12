package com.elephant111.repository;

import com.elephant111.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
    public List<Users> findAll();
}
