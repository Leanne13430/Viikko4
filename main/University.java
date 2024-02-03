package main;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class University {
    final private String FILENAME;
    private ArrayList<Student> students = new ArrayList<>();


    
    public University () {
        FILENAME = "students.data";
    }

    public void addStudent(Student student) {
        students.add(student);
    }
        
    
    public void listStudents() {
        System.out.println("Opiskelijat:");
        for (Student student : students) {
            System.out.println(student.getStudentNumber() + ": " + student.getStudentName());
        }
    }

    
    public void listStudentsNameIndex () {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i).getStudentName());

        }
    }

    public Student getStudentbyIndex (int studentIndex) {
        return students.get(studentIndex);
        
    }

    public void printStudentCourses(int indexStudent) {
        Student std = students.get(indexStudent);
        std.printGrades();
    }

    
    public void saveStudents() {

        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");

        }
        
    }

    public void loadStudents() {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
        
        } catch (IOException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");

        } catch (ClassNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
        }
        
        
    
    }


   
        



    

    
    
}
