package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(examScores));

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExamScores() {

        String examScoresAsString = "Exam Scores: \n";
        for (int i = 0; i < examScores.size(); i++) {
             examScoresAsString += String.format("\tExam %d -> %.0f\n", i+1, examScores.get(i));
        }
        return examScoresAsString;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores() {
        this.examScores = examScores;
    }
}

