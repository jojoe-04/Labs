package Dump.Education.education.src.School;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.DoubleStream;

/**
 * STUDENT CLASS
 */
public class Student implements Nameable, HasLevel {

    protected List<Double> grades;
    protected String name;
    private Level level;

    /**
     * Default Constructor
     */
    public Student() {
        this.grades = new ArrayList<>();
        this.name = "No name";
    }


    /**
     * 2nd Constructor
     * @param name
     * @param level
     */
    public Student(String name, Level level) {
        this.grades = new ArrayList<>();
        this.name = name;
        this.level = level;
    }

    public Level getLevel() {
        return this.level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;

    }

    /**
     * @return List<Double> return the grades
     */
    public List<Double> getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public void addGrades(double[] grades) {
        for (double each : grades) // do some check to see if grade is valid
            this.grades.add(each);
    }

    public double getAverageGrade() {
        return this.grades.stream().mapToDouble(a -> a).average().getAsDouble();
    }

    public void displayGrades() {
        this.grades.stream().map(x -> x).forEach(System.out::println);
    }

    public double getMaxGrade() {
        return this.grades.stream().mapToDouble(v -> v).max().orElseThrow(NoSuchElementException::new);
    }

    public DoubleStream getGradesAsDoubleStream() {
        return DoubleStream.of(this.grades.stream().mapToDouble(x -> x).toArray());
    }

    public static void main(String[] args) {
        System.out.println("From Main Method : ");
        ArrayList<Double> listSix = new ArrayList<Double>(); // refactor code to not take constructor parameter
        listSix.add(2.0);
        listSix.add(3.0);
        listSix.add(4.0);
        listSix.add(5.0);

        // Jojoe Student
        Student Jojoe = new Student();
        double[] jojoeGrades = { 2.0, 2.0, 2.0, 2.0, 2.0 };
        Jojoe.addGrades(jojoeGrades);

        // Emma Student
        Student Emma = new Student();
        double[] emmaGrades = { 3.0, 3.0, 3.0, 3.0, 3.0 };
        Emma.addGrades(emmaGrades);
        System.out.println(Emma.getGrades());

        // Student ainoo = new Student(listSix);
        System.out.println(Jojoe.getAverageGrade());

        Lecture lecture1 = new Lecture();
        lecture1.enter(Jojoe);
        lecture1.enter(Emma);

        System.out.println(lecture1.getHighestAverageGrade());

        // Naughty Student
        NaughtyStudent Edem = new NaughtyStudent();
        Edem.addGrades(emmaGrades);
        System.out.println(Edem.getGrades());

        // Abstract Types
        Nameable Student = new Student();

    }

}
