package School;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RegisterV2 {

    private List<Student> students;

    public RegisterV2(List<Student> students) {
        this.students = students;
    }

    public List<String> getRegister() {
        return students.stream().map(x -> x.getName()).collect(Collectors.toList());
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {

        return (Map<Level, List<Student>>) students.stream()
                .collect(Collectors.groupingBy(Student::getLevel, Collectors.mapping(e -> e, Collectors.toList())));
    }

    public List<Student> sort(Comparator<Student> comparator) {

        return new ArrayList<Student>();

    }

    public Student getStudentByName(String name) throws StudentNotFoundException {

        Student guy = (Student) students.stream().filter(x -> x.getName().equals(name));
        if (guy == null)
            throw new StudentNotFoundException();
        return guy;
    }

    public double highestGrade() {
        Student student = students.stream().max(Comparator.comparing(Student::getMaxGrade)).get();
        return student.getAverageGrade();
    }

    public double averageOfAllGrades() {

        List<Double> allGrades = this.students.stream().flatMap(x -> x.getGrades().stream())
                .collect(Collectors.toList());

        return allGrades.stream().mapToDouble(a -> a).average().getAsDouble();

    }

    public List<Double> gradesAbovePercent(double sixty) {

        List<Double> allGrades = this.students.stream().flatMap(x -> x.getGrades().stream())
                .collect(Collectors.toList());

        return allGrades.stream().filter(a -> a > sixty).collect(Collectors.toList());
    }

    public Optional<Student> getStudentByNameOptional(String name) {
        Optional<Student> student = Optional.of((Student) students.stream().filter(x -> x.getName().equals(name)));

        // use optonal or else or get is present
        // if(student.isPresent())
        return student;
    }

    public List<Student> getStudentsByNameOptional(List<String> names) {
        List<Student> students = new ArrayList<Student>();
        for (String name : names) {
            Optional<Student> retrievedStudent = getStudentByNameOptional(name);
            if (retrievedStudent.isPresent())
                students.add(retrievedStudent.get());
        }
        return students;
    }

}

// for (Student each : this.students)a

// return each.getGrades().stream().

// .stream().mapToDouble(a -> a.ge).average().getAsDouble();
// return students.stream().filter(x -> x.getLevel().equals(level)).collect(
// Collectors.groupingBy(Student::getLevel,
// Collectors.mapping(Student::getName), Collectors.toList()));
// return students.stream().filter(x -> x.getLevel().equals(level))
// .collect(Collectors.toMap(students::getLevel, List.of(students::getLevel)));
