package Labs.Java.Intro;

public class Randoms {

    /**
     * Returns a random integer in a specific range
     * 
     * @param start - start range of random number
     * @param end   - end range of random number
     * @return
     */
    public static int generateRandom(int max, int min) {
        int rand = (int) (Math.random() * (max - min) + min); // convert number to random int
        return rand;
    }

    /**
     * Gets Text name of random Numbers
     * 
     * @param num
     * @return text name
     */
    public static String getTextName(int num) {
        System.out.println("Number: " + num);
        switch (num) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "Nine";

            default:
                return "Not in range 0-9";
        }
    }

    /**
     * Do while version of print random numbers until stop
     */
    public static void randomStopValue() {
        int num = generateRandom(-3, 3);
        do {
            System.out.println(num);
            num = generateRandom(3, -3);
            System.out.println(num);

        } while (num != 0);

    }

    /**
     * While version of print random numbers until stop
     */
    public static void randomStopValueV2() {
        int num = generateRandom(-3, 3);
        while (num != 0) {
            System.out.println(num);
            num = generateRandom(3, -3);
            System.out.println(num);

        }

    }

    public static void main(String[] args) {
        System.out.println("Program Generates a random integer & checks if it's even or odd: ");
        System.out.println(" ");
        System.out.println(getTextName(generateRandom(9, 0)));
        System.out.println(" ");
        System.out.println(" ");

        System.out.println(" Do while Method: ");
        randomStopValue();
        System.out.println("  ");
        System.out.println(" While Method: ");
        randomStopValueV2();

    }

}
