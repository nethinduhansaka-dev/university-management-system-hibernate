package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;
import util.HibernateUtil;

public class StudentDao implements IStudentDao {
	
	// save Student 
    // get All Students 
    // get Student By Id 
    // Update Student 
    // Delete Student 
	// tx = transaction

    @Override
    public void saveStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	 // start the transaction
        	tx = session.beginTransaction();
        	// save student object 
            session.save(student);
         // commit the transaction
            tx.commit();
        } catch (Exception e) { 
            if (tx != null) { 
                tx.rollback(); 
            } 
        }
    }

    @Override
    public void updateStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	 // start the transaction
        	tx = session.beginTransaction();
        	// update student object
            session.update(student);
         // commit the transaction
            tx.commit();
        }
    }

    @Override
    public Student getStudentById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	// get student object
        	return session.get(Student.class, id);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        try (Session session =  HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }

    @Override
    public void deleteStudent(int id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	// start the transaction
        	tx = session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
            	 // get student object 
                session.delete(student);
            }
            // commit the transaction 
            tx.commit();
        }
    }

    

    @Override
    public List<Student> getStudentsByDegree(String degree) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery( "from Student where degreeProgram = :deg",Student.class)
                    .setParameter("deg", degree)
                    .list();
        }
    }

    @Override
    public List<Student> getTopStudents(double minGpa) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery(
                    "from Student where gpa >= :gpa",
                    Student.class)
                    .setParameter("gpa", minGpa)
                    .list();
        }
    }
}
