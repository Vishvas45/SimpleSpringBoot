package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Student;

public interface StudentDao {
	public Student  saveStudent(Student student );
	public Student getStudentById(String studentId);
	public List<Student> getAllStudent();
	public boolean deletStudentById(String studentid);
	public Student updateStudent(Student student);

}
