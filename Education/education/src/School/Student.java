package School;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
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

    /**
     * @return level of the student
     */
    public Level getLevel() {
        return this.level;
    }

    /**
     * Set name of the student
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name of the student 
     */
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

    /**
     * Add grades to student grades
     * @param grades
     */
    public void addGrades(double[] grades) {
        // do some check to see if grade is valid
        for (double each : grades) 
            this.grades.add(each);
    }

    /**
     * @return average grade of grades
     */
    public double getAverageGrade() {
        return this.grades.stream().mapToDouble(a -> a).average().getAsDouble();
    }

      /**
     * @return average grade of grades
     */
    public List<Double> getGradesABove60() {
        return this.grades.stream().filter(a -> a > 0.60).collect(Collectors.toList());
    }

    /**
     * Display grades of student
     */
    public void displayGrades() {
        this.grades.stream().map(x -> x).forEach(System.out::println);
    }

    /**
     * @return maximum grade of student
     */
    public double getMaxGrade() {
        return this.grades.stream().mapToDouble(v -> v).max().orElseThrow(NoSuchElementException::new);
    }

    /**
     * @return double stream of grades
     */
    public DoubleStream getGradesAsDoubleStream() {
        return DoubleStream.of(this.grades.stream().mapToDouble(x -> x).toArray());
    }


    @Override
    public String toString() {
        return "{" +
            " grades='" + getGrades() + "'" +
            ", name='" + getName() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }


    public static void main(String[] args) {
        // System.out.println("DEMO : ");
        // ArrayList<Double> listSix = new ArrayList<>(); // refactor code to not take constructor parameter
        // listSix.add(2.0);
        // listSix.add(3.0);
        // listSix.add(4.0);
        // listSix.add(5.0);

        // // JJOJOE STUDENT
        // Student Jojoe = new Student();
        // double[] jojoeGrades = { 2.0, 2.0, 2.0, 2.0, 2.0 };
        // Jojoe.addGrades(jojoeGrades);

        // // EMMA STUDENT
        // Student Emma = new Student();
        // double[] emmaGrades = { 3.0, 3.0, 3.0, 3.0, 3.0 };
        // Emma.addGrades(emmaGrades);
        // System.out.println(Emma.getGrades());

        // // // Student ainoo = new Student(listSix);
        // // System.out.println(Jojoe.getAverageGrade());

        // // Lecture lecture1 = new Lecture();
        // // lecture1.enter(Jojoe);
        // // lecture1.enter(Emma);

        // // System.out.println(lecture1.getHighestAverageGrade());

        // // Naughty Student
        // NaughtyStudent Edem = new NaughtyStudent();
        // Edem.addGrades(emmaGrades);
        // System.out.println(Edem.getGrades());

        // // // Abstract Types
        // // Nameable Student = new Student();


        // // NORMAL STUDENT
        // System.out.println("---NORMAL STUDENT---");
        // Student Emma = new Student();
        // double[] emmaGrades = { 3.0, 3.0, 3.0, 3.0, 3.0 };
        // Emma.addGrades(emmaGrades);
        // System.out.println("Emma Grades ->" + Emma.getGrades());
        // System.out.println("Emma Average ->" + Emma.getAverageGrade());
        // System.out.println(" ");


        //  // NAUGHTY STUDENT
        //  System.out.println("---NAUGHTY STUDENT---");
        //  NaughtyStudent Edem = new NaughtyStudent();
        //  Edem.addGrades(emmaGrades);
        //  System.out.println("Naughty Edem ->" + Edem.getGrades());
        //  System.out.println("Edem Average ->" + Edem.getAverageGrade());


         // BAG OF STUDENTS DEMO
         Student Esly = new Student("Esly",Level.hundred);
         Student Rita = new Student("Rita",Level.threeHundred);
         Bag<Student> Batch1 = new Bag<>();
         Batch1.add(Esly);
         Batch1.add(Rita);
         Batch1.display();



        //  Student Jem = new Student();

    }

}
