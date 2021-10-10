package Labs.Java.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPlay {

    public static int generateRandom(int max, int min) {
        int rand = (int) (Math.random() * (max - min) + min); // convert number to random int
        return rand;
    }

    public static void main(String[] args) {

        Set<Integer> listSix = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            int newRand = generateRandom(49, 1);
            listSix.add(newRand);

        }

        TreeSet<Integer> treeSix = new TreeSet<Integer>();
        treeSix.addAll(listSix);

        for (int each : treeSix) {
            System.out.println(each);
        }

    }

}
