package School;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lecture {

    private List<Student> students;

    public Lecture() {
        this.students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;

    }

    public void enter(Student newStudent) {
        // check if student can attend this lecture
        this.students.add(newStudent);

    }

    public double getHighestAverageGrade() {

        // Person minByAge = people
        // .stream()
        // .min(Comparator.comparing(Person::getAge))
        // .orElseThrow(NoSuchElementException::new);

        Student student = students.stream().max(Comparator.comparing(Student::getAverageGrade)).get();
        return student.getAverageGrade();

        // get averages of all students grade and return the highest

    }

}