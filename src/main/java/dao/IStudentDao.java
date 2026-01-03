package dao;

import java.util.List;
import model.Student;

public interface IStudentDao {

    void saveStudent(Student student);
    void updateStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void deleteStudent(int id);

    // New functions (Creativity)
    List<Student> getStudentsByDegree(String degree);
    List<Student> getTopStudents(double minGpa);
}
