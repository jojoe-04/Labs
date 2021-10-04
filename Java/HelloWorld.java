
package Labs.Java;

class HelloWorld {

    /**
     * Returns the number if the number is even
     * 
     * @param num
     * @return
     */
    public static int evaluateEven(int num) {
        return num;
    }

    public static double generateRandom() {
        double rand = Math.random();
        return rand;
    }

    public static int generateRandomInt() {
        return 4;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Random Number: " + generateRandom());
    }
}