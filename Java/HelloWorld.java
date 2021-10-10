
package Labs.Java;

class HelloWorld {

    /**
     * Returns the number if the number is even
     * 
     * @param num
     * @return
     */
    public static int evaluateEven(int num) {
        System.out.println("Number: " + num);
        return num;
    }

    public static double generateRandom() {
        double rand = Math.random();
        return rand;
    }

    public static double generateRandomInt() {
        double rand = (int) (Math.random() * 10) + 1;
        return rand;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Random Number: " + generateRandom());
        System.out.println("Random Number: " + generateRandomInt());
    }
}