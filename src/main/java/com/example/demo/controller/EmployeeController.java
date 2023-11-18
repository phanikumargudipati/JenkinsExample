package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employeerepository.EmployeeRepository;
import com.example.demo.entity.Employee;

@RestController
@RequestMapping
public class EmployeeController {
	@Autowired
	EmployeeRepository repo;
	@PostMapping("/add")
	public Employee saveEmployeeDetails(@RequestBody Employee e) {
		try {
			repo.save(e);
		}catch(Exception a) {
			System.out.println(a.getMessage());
		}
		return e;
		
	}

}
