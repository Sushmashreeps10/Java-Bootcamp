package controller;

import techm1.Student;
import SERVICE.StudentServiceImpl;

public class StudentController {
	private StudentServiceImpl service;

	public StudentController(StudentServiceImpl StudentService) {
		this.service = StudentService;
	}
	public int insertStudent(Student s) {
		return service.insertStudent(s);
	}

}