package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Employee;
import com.example.taskmanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	
	@GetMapping
	public List<Employee> getAllEmployees() {
	return employeeService.getAllEmployees();

}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
	Employee employee = employeeService.getEmployeeById(id);
	return employee != null ? ResponseEntity.ok(employee) : ResponseEntity.notFound().build();

}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
	return employeeService.createEmployee(employee);

}
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Request Employee employee) {
	Employee updatedEmployee = employeeService.updateEmployee(id, employee);
	return ResponseEntity.ok(updatedEmployee);

}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
	employeeService.deleteEmployee(id);
	return ResponseEntity.noContent().build();

}
}


	
	



