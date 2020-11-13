package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void classroomConstructorTest(){
        // Given
        int expectedMaxStudents = 10;
        Classroom classroom = new Classroom(expectedMaxStudents);

        // When
        int actualMaxStudents = classroom.getStudent().length;

        // Then
        Assert.assertEquals(expectedMaxStudents, actualMaxStudents);
    }

    @Test
    public void getAverageExamScore(){
        // Given
        Classroom classroom = new Classroom();
        Double expectedClassAverage = 10.0;

        // When
        Double actualClassAverage = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expectedClassAverage, actualClassAverage);
    }

}
