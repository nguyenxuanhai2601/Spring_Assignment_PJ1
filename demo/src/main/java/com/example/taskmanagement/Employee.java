package com.example.taskmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Longg id;
	private String username;
	private String password;
	private String role;
	
	



}
