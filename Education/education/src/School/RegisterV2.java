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
        return students.stream().map(Student::getName).collect(Collectors.toList());
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getLevel, Collectors.mapping(e -> e, Collectors.toList())));
    }

    public List<Student> sort(Comparator<Student> comparator) {
        return new ArrayList<>();

    }

    public Student getStudentByName(String name) throws StudentNotFoundException {
        Student guy = (Student) students.stream().filter(x -> x.getName().equals(name));
        if (guy == null)
            throw new StudentNotFoundException();
        return guy;
    }

    public double getHighestGrade() {
        Student student = students.stream().max(Comparator.comparing(Student::getMaxGrade)).get();
        return student.getMaxGrade();
    }

    public double getHighestGradeII() {
        return this.students.stream().flatMap(x -> x.getGrades().stream()).max(Double::compare).get();
         
    }

    /**
     * @return
     */
    public double getAverageOfAllGrades() {
        List<Double> allGrades = this.students.stream().flatMap(x -> x.getGrades().stream())
                .collect(Collectors.toList());
        return allGrades.stream().mapToDouble(a -> a).average().getAsDouble();

    }

    /** 
     * @param value
     * @return
     */
    public List<Double> gradesAbovePercent(double value) {
       return this.students.stream().flatMap(x -> x.getGrades().stream()).filter(x -> x > value)
                .collect(Collectors.toList());
    }

    /**
     * @param name
     * @return
     */
    public Optional<Student> getStudentByNameOptional(String name) {
        return Optional.of((Student) students.stream().filter(x -> x.getName().equals(name)));
    }

    /**
     * @param names
     * @return
     */
    public List<Student> getStudentsByNameOptional(List<String> names) {
        List<Student> students = new ArrayList<>();
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
