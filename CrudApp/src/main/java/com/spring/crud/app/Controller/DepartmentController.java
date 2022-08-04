package com.spring.crud.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.app.Entity.Department;
import com.spring.crud.app.Service.DepartmentService;


@RestController



public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	// Create Department
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	// Get All Departments
	@GetMapping("/departments")
	public List<Department> fetchDepartments() {
		return departmentService.fetchDepartments();
	}
	
	// Get Department by departmentId
	@GetMapping("/departments/{id}")
	public Department getDepartmentsByID(@PathVariable ("id") Long departmentId) {
		return departmentService.getDepartmentsByID(departmentId);
	}
	
	// Delete Department by departmentId
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentsByID(@PathVariable ("id") Long departmentId) {
		departmentService.deleteDepartmentsById(departmentId);
		return "Department Deleted  Successfully";
	}
	
	// update Department by departmentId
	@PutMapping("/departments/{id}")
	public Department updateDepartments(@PathVariable ("id") Long departmentId, @RequestBody Department department) {
		return departmentService.updateDepartments(departmentId, department);
	}
	
	// get department by departmentName
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentbyName(@PathVariable ("name") String departmentName) { 
		return departmentService.fetchDepartmentbyName(departmentName);
	}
	
}
