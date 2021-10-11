
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentAverageGrade() {

        ArrayList<Double> listSix = new ArrayList<Double>();
        listSix.add(2.0);
        listSix.add(3.0);
        listSix.add(4.0);
        listSix.add(5.0);

        Student jojoe = new Student(listSix);
        Student Emma = new Student(listSix);
        Student Ainoo = new Student(listSix);
        System.out.println(jojoe.getAverageGrade());
        assertEquals(3.5, jojoe.getAverageGrade());
    }

    // assertEquals("T1", t1.getID());

}
