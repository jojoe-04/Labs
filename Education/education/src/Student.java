import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> grades;

    public Student(List<Double> grades) {
        this.grades = grades;
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

    public double getAverageGrade() {
        double average = this.grades.stream().mapToDouble(a -> a).average().getAsDouble();
        return average;
    }

    public static void main(String[] args) {
        System.out.println("From Main Method : ");
        ArrayList<Double> listSix = new ArrayList<Double>();
        listSix.add(2.0);
        listSix.add(3.0);
        listSix.add(4.0);
        listSix.add(5.0);

        Student jojoe = new Student(listSix);
        System.out.println(jojoe.getAverageGrade());
    }

}
