package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Employee;
import com.example.taskmanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
	return employeeRespository.findAll();

}
	public Employee getEmployeeById(Long id) {
	return employeeRespository.findById(id).orElse(null);

}
	public Employee createEmployee(Employee employee) {
	return employeeRespository.save(employee);

}
	public Employee updateEmployee(Long id, Employee employee) {
	employee.setID(id);
	return employeeRespository.save(employee);

}
	public void deleteEmployee(Long id) {
	employeeRespository.deleteById(id);

}
}


	
	



