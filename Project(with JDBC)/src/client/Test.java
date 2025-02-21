package client;

import DataSource.MySqlDBConnection;
import SERVICE.StudentServiceImpl;
import controller.StudentController;
import repository.StudentRepository;
import techm1.Student;

public class Test {
    public static void main(String[] args) {
        try {
            MySqlDBConnection dbConnection = new MySqlDBConnection();
            StudentRepository studentRepository = new StudentRepository(dbConnection);
            StudentServiceImpl studentService = new StudentServiceImpl(studentRepository);
            StudentController studentController = new StudentController(studentService);
            Student student = new Student("1", "Ron", "sushma@example.com", "123 Street", 2024);
            int result = studentController.insertStudent(student);

            if (result > 0) {
                System.out.println("Student inserted successfully!");
            } else {
                System.out.println("Failed to insert student.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
