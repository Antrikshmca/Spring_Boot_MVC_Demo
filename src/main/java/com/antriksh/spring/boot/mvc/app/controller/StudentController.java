package com.antriksh.spring.boot.mvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antriksh.spring.boot.mvc.app.model.Student;
import com.antriksh.spring.boot.mvc.app.repo.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addData")
	public String addData(Student stu) {
		return "home.jsp";
	}
}
