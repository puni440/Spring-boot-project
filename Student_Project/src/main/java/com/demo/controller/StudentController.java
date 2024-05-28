package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Student;
import com.demo.Service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@GetMapping("/view")
	public List<Student> view_std() {

		return ss.view_stud();
	}

	@PostMapping("/save")
	public String save(@RequestBody Student s) {
		return ss.save_stu(s);

	}

	@GetMapping("/view/{id}")
	public Optional<Student> view_one_std(@PathVariable Long id) {

		return ss.view_one_stud(id);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return ss.del_stu(id);

	}

}
