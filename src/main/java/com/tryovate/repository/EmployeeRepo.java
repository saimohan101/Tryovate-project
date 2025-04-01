package com.tryovate.repository;

import com.tryovate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

     public Optional<Employee> findByEmail(String email);
}

