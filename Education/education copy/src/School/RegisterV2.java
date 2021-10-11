package School;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

        // return students.stream().filter(x -> x.getLevel().equals(level)).collect(
        // Collectors.groupingBy(Student::getLevel,
        // Collectors.mapping(Student::getName), Collectors.toList()));
        // return students.stream().filter(x -> x.getLevel().equals(level))
        // .collect(Collectors.toMap(students::getLevel, List.of(students::getLevel)));

    }

    // public List<Student> sort(Comparator<Student> comparator) {

    // }

    public Student getStudentByName(String name) {

        Student guy = (Student) students.stream().filter(x -> x.getName().equals(name));
        // if (!guy)
        // throw new StudentNotFoundException();
        return guy;
    }

}
