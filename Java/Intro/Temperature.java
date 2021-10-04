package Labs.Java.Intro;

public class Temperature {
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
     * Checks what temperature range number belongs to
     * 
     * @param num int
     * @return String
     */
    public static String checkTemperature(int num) {
        System.out.println("Number: " + num);
        if (num == 0)
            return "frozen";
        else if (num >= 1 && num <= 14)
            return "cold";
        else if (num >= 15 && num <= 24)
            return "cool";
        else if (num >= 25 && num <= 40)
            return "warm";
        else if (num >= 41 && num <= 60)
            return "hot";
        else if (num >= 61 && num <= 80)
            return "very hot";
        else if (num >= 81 && num <= 99)
            return "extremely hot";
        else if (num >= 1 && num <= 14)
            return "cold";
        else if (num == 100)
            return "cold";

        return "Invalid Weather Type";
    }

    public static void main(String[] args) {
        System.out.println("Program Generates a random integer & checks if it's even or odd: ");
        System.out.println(" ");
        System.out.println(checkTemperature(generateRandom()));
    }
}
