package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Project;
import com.example.taskmanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Project> getAllProjects() {
	return projectRespository.findAll();

}
	public Project getProjectById(Long id) {
	return projectRespository.findById(id).orElse(null);

}
	public Project createProject(Project project) {
	return projectRespository.save(project);

}
	public Project updateProject(Long id, Project project) {
	project.setID(id);
	return projectRespository.save(project);

}
	public void deleteProject(Long id) {
	projectRespository.deleteById(id);

}
}


	
	



