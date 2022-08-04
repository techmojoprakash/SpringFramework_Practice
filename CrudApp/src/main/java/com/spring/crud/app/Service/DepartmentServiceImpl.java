package com.spring.crud.app.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.app.Entity.Department;
import com.spring.crud.app.Repository.DepartmentRepository;



@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}

	@Override
	public List<Department> fetchDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentsByID(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentsById(Long departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartments(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		
		Department DbDept = departmentRepository.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName()) &&
			!"".equalsIgnoreCase(department.getDepartmentName())) {
				DbDept.setDepartmentName(department.getDepartmentName());
			}
		
		if(Objects.nonNull(department.getAddress()) &&
				!"".equalsIgnoreCase(department.getAddress())) {
					DbDept.setAddress(department.getAddress());
				}
		
		if(Objects.nonNull(department.getDepartmentcode()) &&
				!"".equalsIgnoreCase(department.getDepartmentcode())) {
					DbDept.setDepartmentcode(department.getDepartmentcode());
				}
		
		return departmentRepository.save(DbDept);
	}

	@Override
	public Department fetchDepartmentbyName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}




}
