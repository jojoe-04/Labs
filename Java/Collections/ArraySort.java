package Labs.Java.Collections;

import java.util.Arrays;

public class ArraySort {

    public static int generateRandom(int max, int min) {
        int rand = (int) (Math.random() * (max - min) + min); // convert number to random int
        return rand;
    }

    public void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position
             * ahead of their current position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n */
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int arrayOfSix[] = new int[6];

        // normal fill array approach
        for (int i = 0; i < arrayOfSix.length; i++) {
            int newRand = generateRandom(49, 1);
            // avoid repeatition
            boolean contains = Arrays.asList(arrayOfSix).contains(newRand);
            if (contains) {
                System.out.println("reapedt");
            } else {
                arrayOfSix[i] = newRand;
            }

        }

        // sort order of elements
        Arrays.sort(arrayOfSix);
        for (int each : arrayOfSix) {
            System.out.println(each);
        }

        // insertion sort approach

    }

}
