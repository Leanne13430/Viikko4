package main;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Calculator {
    
    public double getAverageGrade(Student s) {
        List<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0;
       
       }
       
        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.getGrade();
        }
        return (double) sum / grades.size();

    }

    public double getMedianGrade(Student s) {
        List<Grade> grades = s.getGrades();
        if (grades.isEmpty()) {
            return 0;
        }
        
        ArrayList<Integer> gradeValues = new ArrayList<>();
        for (Grade grade : grades) {
            gradeValues.add(grade.getGrade());

        }

        Collections.sort(gradeValues);
        int size = gradeValues.size();

        if (size % 2 == 0) {
            return (gradeValues.get(size / 2 - 1) + gradeValues.get(size / 2)) / 2.0;

        
        } else {
            return gradeValues.get(size / 2);
        }



    
    
        


    }


    
}
