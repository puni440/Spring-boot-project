package com.demo.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Student;

@Repository
public interface Studentrep extends JpaRepository<Student, Long> {

}
