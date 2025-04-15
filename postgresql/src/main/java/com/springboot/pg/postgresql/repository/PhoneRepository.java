package com.springboot.pg.postgresql.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pg.postgresql.model.PhoneNumbers;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneNumbers, UUID>{

}
