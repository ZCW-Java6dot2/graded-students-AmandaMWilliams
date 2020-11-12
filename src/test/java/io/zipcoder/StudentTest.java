package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Struct;
import java.util.ArrayList;

public class StudentTest {
    @Test
    public void studentConstructorTest() {
        // Given
        String expectedFirstName = "Amanda";
        String expectedLastName = "Williams";
        Double[] expectedExamScores = {100.0, 97.0, 95.4};
        String expectedExamScoresAsString = "Exam Scores: \n\tExam 1 -> 100\n\tExam 2 -> 97\n\tExam 3 -> 95\n";
        Student student = new Student(expectedFirstName, expectedLastName, expectedExamScores);

        // When
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualExamScores = student.getExamScores();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScoresAsString, actualExamScores);

    }

    @Test
    public void setFirstNameTest() {
        // Given
        String expectedFirstName = "Leon";
        Student student = new Student(expectedFirstName, "", new Double[0]);

        // When
       student.setFirstName(expectedFirstName);
       String actualFirstName = student.getFirstName();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void setLastNameTest() {
        // Given
        String expectedLastName = "Hunter";
        Student student = new Student("", "", new Double[0]);


        // When
        student.setLastName(expectedLastName);
        String actualLastName = student.getLastName();

        // Then
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void getExamScoresTest() {
        // Given
        String expectedExamScores = "Exam Scores: \n" +"\tExam 1 -> 100\n" +"\tExam 2 -> 95\n";
        Student student = new Student(null, null, new Double[] {100.0, 95.0});

        // When
        String actualExamScores = student.getExamScores();

        // Then
        Assert.assertEquals(expectedExamScores, actualExamScores);

    }

    @Test
    public void getNumberOfExamsTest(){
        // Given
        Student student = new Student(null, null, new Double[] {95.0, 67.0, 101.0});
        int expectedNumberOfExams = 3;

        // When
        int actualNumberOfExams = student.getNumberOfExamsTaken();

        // Then
        Assert.assertEquals(expectedNumberOfExams, actualNumberOfExams);
    }

    @Test
    public void addExamScoreTest(){
        // Given
        Student student = new Student("Michael", "Williams", new Double[] {});
        String expectedReturn = "Exam Scores: \n" + "\tExam 1 -> 99\n";

        // When
        student.addExamScore(99.0);
        String actualReturn = student.getExamScores();

        // Then
        Assert.assertEquals(expectedReturn, actualReturn);
    }

    @Test
    public void setExamScoresTest(){
        // Given
        Student student = new Student(null, null, new Double[] {} );
        String expectedReturn = "Exam Scores: \n" + "\tExam 1 -> 150\n";

        // When
        student.setExamScore(1, 150.0);
        String actualReturn = student.getExamScores();

        // Then
        Assert.assertEquals(expectedReturn, actualReturn);
    }
}