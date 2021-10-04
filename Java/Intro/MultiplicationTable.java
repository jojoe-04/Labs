package Labs.Java.Intro;

public class MultiplicationTable {

    /**
     * Generates multiplication table for number
     * @param num
     */
    public static void multiply(int num){
        int product = 0;
        for(int i=0; i<13; i++){
            product = num * i;
            System.out.println(num + "*" + i + " = "+ product);
        }
    }


    public static void main(String[] args) {
        multiply(2);
    }

}
