package Labs.Java.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

    public static void main(String[] args) {

        // File not Found Exception
        // try {
        // File file = new File("../HelloWorld.java");
        // FileReader fr = new FileReader(file);
        // // fr.r;
        // } catch (FileNotFoundException e) {
        // System.out.println("File not found");
        // }

        // Out of Bounds Exceoption
        // int num[] = { 1, 2, 3, 4 };
        // System.out.println(num[5]);

        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");

    }

}
