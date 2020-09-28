package com.antriksh.spring.boot.mvc.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.antriksh.spring.boot.mvc.app.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
