package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumOfStudents) {
        this.students = new Student[maxNumOfStudents];
    }

    public Classroom(Student[] collectStudent) {
        this.students = collectStudent;
    }

    //Nullary constructor
    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudent() {
        return students;
    }

    public Double getAverageExamScore() {
        double studentAverage = 0.0;
        double classAverage = 0.0;
        for (int i = 0; i < students.length; i++) {
            studentAverage += students[i].getAverageExamScore();
        }
        classAverage = studentAverage / students.length;
        return classAverage;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
            }

        }
        Arrays.sort(students, new SortNulls());  //Used to sort students based on if they're null or not
    }
}

//Use comparator to get all null values to the end of the array
class SortNulls implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1 == null && s2 == null) {  // if both are null
            return 0;                   //Dont move anything
        } else if (s1 == null) {      //if s1 is null
            return 1;                 //pushes s1 toward the end of the list
        } else if (s2 == null) {     // if s2 is null
            return -1;             //pushes s2 toward the end of the list
        } else {
            return 0;   // if neither are null, dont move them
        }
    }


    public class SortByFirstName implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.getAverageExamScore() == null && s2.getAverageExamScore() == null){
                return 0;
            }
            else if (s1.getAverageExamScore() == s2.getAverageExamScore()) {
                return s1.getLastName().compareTo(s2.getLastName());   // alphabetical order
            } else if (s1.getAverageExamScore() < s2.getAverageExamScore()) {
                return 1;
            } else if (s1.getAverageExamScore() > s2.getAverageExamScore()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}

