import java.util.ArrayList;
import java.util.List;

import School.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        
         // BAG OF STUDENTS DEMO
         System.out.println("---BAG PF STUDENTS---");
         Student Esly = new Student("Esly",Level.hundred);
         Student Rita = new Student("Rita",Level.threeHundred);
         Bag<Student> Batch1 = new Bag<>();
         Batch1.add(Esly);
         Batch1.add(Rita);
         Batch1.display();

         // BAG OF STUDENTS DEMO
         System.out.println(" ");
         System.out.println("---BAG PF LECTURERS---");
         Lecturer Jo = new Lecturer("Jo","Programming");
         Lecturer Lord = new Lecturer("Lord","Science");
         Bag<Lecturer> Batch2 = new Bag<>();
         Batch2.add(Jo);
         Batch2.add(Lord);
         Batch2.display();


        //  STREAMS
        Student Jojoe = new Student();
        double[] jojoeGrades = { 2.0, 3.0, 4.0, 5.0, 6.0 };
        Jojoe.addGrades(jojoeGrades);

        System.out.println(" ");
        System.out.println("----STREAMS-----");
        Jojoe.getGradesAsDoubleStream().forEach(System.out::println);
        System.out.println("Highest Grade of all Students Grade: " + Jojoe.getMaxGrade());

        // Creating Regsiter students and Adding Grades

        // Josh Grades
        Student Josh = new Student("Josh",Level.twoHundred);
        double[] joshGrades = { 1.0, 1.0, 1.0, 1.0};
        Josh.addGrades(joshGrades);
        // Esly Grades
        double[] eslyGrades = { 2.0, 2.0, 2.0, 2.0};
        Esly.addGrades(eslyGrades);
        // Rita Grades
        double[] ritaGrades = { 3.0, 3.0, 3.0, 7.0};
        Rita.addGrades(ritaGrades);

        System.out.println(" ");
        System.out.println("-----REGISTER----");
        ArrayList<Student> registerList = new ArrayList<>(List.of(Esly,Rita,Josh)); // refactor code to not take constructor parameter
        RegisterV2 register1 = new RegisterV2(registerList);

        System.out.println(" ");
        System.out.println("REGISTER LIST ");
        System.out.println(register1.getRegister());

        System.out.println(" ");
        System.out.println("Highest Grade of all Students ->" + register1.getHighestGrade());
        System.out.println("Highest Grade of all Students ->" + register1.getHighestGradeII());
        System.out.println("Average Grade of all Students ->" + register1.getAverageOfAllGrades());
        System.out.println("Grades scoring above 60 ->" + register1.gradesAbovePercent(6));
        
    }

}
