package com.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.Entity.Student;
import com.demo.rep.Studentrep;

@Service
public class StudentService {

	@Autowired
	Studentrep sr;

	public String save_stu(Student s) {
		sr.save(s);
		return "Data Save successfully ";

	}

	public List<Student> view_stud() {

		return sr.findAll();
	}

	public Optional<Student> view_one_stud(Long id) {

		return sr.findById(id);
	}

	public String del_stu(Long id) {
		sr.deleteById(id);
		return id + " is deleted....";

	}

}
