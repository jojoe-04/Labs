package School;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException() {
        // calling the constructor of parent Exception
        super("No Student Found");
    }
}
