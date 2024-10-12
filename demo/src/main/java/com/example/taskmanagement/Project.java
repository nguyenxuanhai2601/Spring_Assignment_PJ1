package com.example.taskmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Longg id;
	private String name;
	private String description;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	



}
