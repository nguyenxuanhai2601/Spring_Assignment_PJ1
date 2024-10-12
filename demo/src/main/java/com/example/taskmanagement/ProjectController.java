package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Project;
import com.example.taskmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	
	@GetMapping
	public List<Project> getAllProjects() {
	return projectService.getAllProjects();

}
	@GetMapping("/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
	Project project = projectService.getProjectById(id);
	return project != null ? ResponseEntity.ok(project) : ResponseEntity.notFound().build();

}
	@PostMapping
	public Project createProjecte(@RequestBody Project project) {
	return projectService.createProject(project);

}
	@PutMapping("/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable Long id, @Request Project project) {
	Project updatedProject = projectService.updateProject(id, project);
	return ResponseEntity.ok(updatedProject);

}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
	projectService.deleteProject(id);
	return ResponseEntity.noContent().build();

}
}


	
	



