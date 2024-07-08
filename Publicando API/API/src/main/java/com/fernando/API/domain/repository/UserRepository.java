package com.fernando.API.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.API.domain.model.User;

public interface UserRepository  extends JpaRepository<User , Long>{


}
