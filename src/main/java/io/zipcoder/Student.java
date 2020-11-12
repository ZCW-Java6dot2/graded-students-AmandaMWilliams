package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    //Student Constructor
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(examScores));

    }

    @Override
    public String toString() {
        return String.format("Student Name: %s %s\n> Average Score: %3.1f\n", getFirstName(), getLastName(), getAverageExamScore())
                + "> " + getExamScores();
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExamScores() {

        String examScoresAsString = "Exam Scores: \n";
        for (int i = 0; i < examScores.size(); i++) {
            examScoresAsString += String.format("\tExam %d -> %.0f\n", i + 1, examScores.get(i));
        }
        return examScoresAsString;
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (Double scores : examScores) {
            sum += scores;
        }
        double averageExamScore = sum / examScores.size();
        return averageExamScore;
    }

    public int getNumberOfExamsTaken() {
        int numberOfExamsTaken = examScores.size();
        return numberOfExamsTaken;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScores.size(), examScore);

        }



//    public void setExamScores() {
//        this.examScores = examScores;
//    }


}

