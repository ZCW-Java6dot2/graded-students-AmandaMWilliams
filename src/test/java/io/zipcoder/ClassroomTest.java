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
        int actualMaxStudents = classroom.getStudents().length;

        // Then
        Assert.assertEquals(expectedMaxStudents, actualMaxStudents);
    }

    @Test
    public void getAverageExamScore(){
        // Given
        Classroom classroom = new Classroom();
        Double expectedClassAverage = 0.0;

        // When
        Double actualClassAverage = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expectedClassAverage, actualClassAverage);
    }

    @Test
    public void addStudentTest(){
        // Given
        Classroom classroom = new Classroom(1);
        Student hillary = new Student("Hillary", "Givhan", new Double[]{});
        Student[] expectedArrayOfStudents = new Student[]{hillary};

        // When
        classroom.addStudent(hillary);
        Student[] actualArrayOfStudents = classroom.getStudents();

        // Then
        Assert.assertEquals(expectedArrayOfStudents, actualArrayOfStudents);

    }
    @Test
    public void removeStudentTest(){
        // Given
        Classroom classroom = new Classroom(1);
        Student hillary = new Student("Hillary", "Givhan", new Double[]{});
        Student amanda = new Student("Amanda", "Williams", new Double[]{});
        Student[] expectedArrayOfStudents = new Student[]{hillary};

        // When
        classroom.addStudent(hillary);
        classroom.addStudent(amanda);
        classroom.removeStudent("Amanda", "Williams");
        Student[] actualArrayOfStudents = classroom.getStudents();

        // Then
        Assert.assertEquals(expectedArrayOfStudents, actualArrayOfStudents);
    }

}
