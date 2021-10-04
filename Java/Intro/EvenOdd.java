package Labs.Java.Intro;

public class EvenOdd {

    /**
     * Returns a random Integer
     * 
     * @return int
     */
    public static int generateRandom() {
        int rand = (int) (Math.random() * 100) + 1; // convert number to random int
        return rand;
    }

    /**
     * Checks if number is Even or Odd
     * 
     * @param num int
     * @return String, Even if number is number & Odd if number is odd
     */
    public static String checkEvenOdd(int num) {
        System.out.println("Number: " + num);
        if (num % 2 == 0) { // even if divisible by 2 without reminder
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.println("Program Generates a random integer & checks if it's even or odd: ");
        System.out.println(" ");
        System.out.println(checkEvenOdd(generateRandom()));
    }

}
