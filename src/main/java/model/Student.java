package model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "degree_program")
    private String degreeProgram;

    @Column(name = "gpa")
    private double gpa;

    public Student() {}

    public Student(String name, String email, String degreeProgram, double gpa) {
        this.name = name;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.gpa = gpa;
    }

    // Getters and Setters

    public  int getId() { 
    	return id; 
    	}
    public void setId(int id) { 
    	this.id = id; 
    	}
    

    public String getName() { 
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name; 
    	}
    

    public String getEmail() { 
    	return email; 
    	}
    public void setEmail(String email) { 
    	this.email = email; 
    	}
    

    public String getDegreeProgram() { 
    	return degreeProgram; 
    	}
    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public double getGpa() { 
    	return gpa; 
    	}
    public void setGpa(double gpa) { 
    	this.gpa = gpa; 
    	}

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name +
                ", email=" + email + ", degree=" +
                degreeProgram + ", gpa=" + gpa + "]";
    }
}
