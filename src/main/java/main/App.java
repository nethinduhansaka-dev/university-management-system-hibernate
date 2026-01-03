package main;

import java.util.List;

import dao.IStudentDao;
import dao.StudentDao;
import model.Student;

public class App {

    public static void main(String[] args) {

        IStudentDao studentDao = new StudentDao();

        // Insert Students
        Student s1 = new Student( "jagath Perera", "jagath@ousl.lk", "BSE", 3.6);

        Student s2 = new Student( "vimal Silva", "vimal@ousl.lk", "BSE", 3.9);

        studentDao.saveStudent(s1);
        studentDao.saveStudent(s2);
        
     // test updateStudent 
        s1.setName("Ram soisa"); 
        studentDao.updateStudent(s1); 

        // Display All Students
        List<Student> students = studentDao.getAllStudents();
        students.forEach(System.out::println);

        // Get Top Students
        System.out.println("\nTop Students:");
        studentDao.getTopStudents(3.7).forEach(System.out::println);
        
        // Delete Student
        studentDao.deleteStudent(s1.getId());
        
        
        
        
     
        
    }
}
