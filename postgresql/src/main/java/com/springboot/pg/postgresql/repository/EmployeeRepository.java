package com.springboot.pg.postgresql.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pg.postgresql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID>{

}
