package com.example.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.model.employee;

public interface Employee_repo extends JpaRepository<employee,Integer> {
    
}
