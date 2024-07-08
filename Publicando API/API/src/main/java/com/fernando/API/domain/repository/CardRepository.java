package com.fernando.API.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.API.domain.model.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

}
