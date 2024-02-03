package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String studentName;
    private int studentNumber;
    private ArrayList<Grade> grades = new ArrayList<>();




    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    
    }

    public String getStudentName() {
        return studentName;
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public void addGrade(String course, int grade) {
        grades.add(new Grade(course, grade));
        
    }

    public void printGrades() {
        for (Grade grade : grades) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        }
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    

    





        




    
}
