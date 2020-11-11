package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public java.lang.String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getExamScores(String firstName, String lastName, ArrayList<Double> examScores) {
        System.out.println("Exam 1 -> " + examScores.get(0));
        System.out.println("Exam 2 -> " + examScores.get(1));
        System.out.println("Exam 3 -> " + examScores.get(2));
        System.out.println("Exam 4 -> " + examScores.get(3));
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public double addExamScore(double examScore) {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(examScore);
        return examScore;
    }
}
