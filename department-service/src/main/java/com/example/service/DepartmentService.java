package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
