package School;

import java.util.ArrayList;
import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent() {
        // List<Double> naughtyGrades = new ArrayList<Double>();
        // super.grades = naughtyGrades;
    }

    @Override
    public void addGrades(double[] grades) {
        for (double each : grades) { // do some check to see if grade is valid
            double increase = (double) (0.1 * each) + each;
            this.grades.add(increase);
        }
    }

}
