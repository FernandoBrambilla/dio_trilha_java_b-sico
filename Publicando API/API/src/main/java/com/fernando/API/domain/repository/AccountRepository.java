package com.fernando.API.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.API.domain.model.Account;

public interface AccountRepository  extends JpaRepository<Account, Long>{

}
