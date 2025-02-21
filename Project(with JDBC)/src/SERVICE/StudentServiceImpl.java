package SERVICE;

import java.util.List;

import techm1.Student;
import repository.StudentRepository;

public class StudentServiceImpl {
	private StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}
	public int insertStudent(Student s) {
		return repository.insertStudent(s);
	}

}