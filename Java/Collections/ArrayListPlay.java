package Labs.Java.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPlay {

    public static int generateRandom(int max, int min) {
        int rand = (int) (Math.random() * (max - min) + min); // convert number to random int
        return rand;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listSix = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int newRand = generateRandom(49, 1);
            boolean contains = listSix.contains(newRand);

            if (contains) {
                System.out.println("reapedt");
            } else {
                listSix.add(newRand);
            }

        }

        Collections.sort(listSix);
        for (int each : listSix) {
            System.out.println(each);
        }

    }

}
