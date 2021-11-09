package School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent() {
        // List<Double> naughtyGrades = new ArrayList<Double>();
        // super.grades = naughtyGrades;
    }

    /**
     * Naughty student avergae grade is 10% higher 
     * @return average
     */
    @Override
    public double getAverageGrade() {
        double avg = this.grades.stream().mapToDouble(a -> a).average().getAsDouble();
        return (avg * 0.1) + avg;

    }


    public void addGradesII(double[] grades) {
        for (double each : grades) { // do some check to see if grade is valid
            double increase = (0.1 * each) + each;
            this.grades.add(increase);
        }
    }


}
