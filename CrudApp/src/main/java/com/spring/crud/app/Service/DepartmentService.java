package com.spring.crud.app.Service;

import java.util.List;

import com.spring.crud.app.Entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartments();

	Department getDepartmentsByID(Long departmentId);

	void deleteDepartmentsById(Long departmentId);

	Department updateDepartments(Long departmentId, Department department);

	Department fetchDepartmentbyName(String departmentName);
	

}
