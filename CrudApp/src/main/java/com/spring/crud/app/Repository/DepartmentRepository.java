package com.spring.crud.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.app.Entity.Department;

//@Repository

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentName(String departmentName);

}
