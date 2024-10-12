package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmloyeeRepository extends JpaRepository<Employee, Long> {
	Employee findByUsername(string username);
}
	



}
