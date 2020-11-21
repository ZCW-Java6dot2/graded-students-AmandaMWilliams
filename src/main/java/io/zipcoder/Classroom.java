package io.zipcoder;

import java.util.*;

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

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sumOfAllExamScoreAverages = 0.0;
        for (Student student : students) {
            if (student != null) {
                sumOfAllExamScoreAverages += student.getAverageExamScore();
            }
        }
        return sumOfAllExamScoreAverages/students.length;
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

    public Student[] getStudentsByScore(){
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));
      //  Collections.sort(studentsList);
        return studentsList.toArray(new Student[studentsList.size()]);
    }

    public Map<String, Character> getGradeBook(){
        Map<String, Character> gradeBook = new HashMap<>();
        int count;
        int percent;

        for (int i = 0; i < students.length; i++) {
            count = 0;
            for (int j = 0; j < students.length; j++) {
                if(students[i].getAverageExamScore() > students[j].getAverageExamScore()){
                    count++;
                }
            }
            percent = (count * 100)/(students.length -1);
            if(percent > 89){
                gradeBook.put(students[i].toString(), 'A');
            } else if(percent <= 89 && 70 < percent){
                gradeBook.put(students[i].toString(), 'B');
            } else if(percent <=70 && percent > 49){
                gradeBook.put(students[i].toString(), 'C');
            } else if(percent <= 49 && percent > 11){
                gradeBook.put(students[i].toString(), 'D');
            } else{
                gradeBook.put(students[i].toString(), 'F');
            }
        }
        return gradeBook;
    }
}

//Use comparator to get all null values to the end of the array
class SortNulls implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1 == null && s2 == null) {  // if both are null
            return 0;                   //Dont move anything
        } else if (s1 == null) {      //if s1 is null
            return 1;                 //pushes s1 toward the end of the list
        } else if (s2 == null) {      // if s2 is null
            return -1;                //pushes s2 toward the end of the list
        } else {
            return 0;   // if neither are null, dont move them
        }
    }


    public class SortByScore implements Comparator<Student> {
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

