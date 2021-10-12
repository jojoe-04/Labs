package test;

import static org.junit.Assert.*;
import org.junit.Test;

import School.*;

public class StudentTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testStudentAverage() {
        System.out.println("Test Student Average");

        Student Jojoe = new Student();
        double[] jojoeGrades = { 2.0, 2.0, 2.0, 2.0, 2.0 };

        Jojoe.addGrades(jojoeGrades);
        assertEquals(2.0, Jojoe.getAverageGrade(), DELTA);
        System.out.println("Test Student Average");

    }

}
