package Labs.Java.Collections;

public class ArrayPlay {
    private int size;

    private int[] array;

    public ArrayPlay(int[] array, int size) {
        this.array = new int[size];
        int value = 1;

        for (int i = 0; i < size; i++) {
            this.array[i] = value;
            value++;
        }
    }

    public ArrayPlay() {
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public ArrayPlay size(int size) {
        setSize(size);
        return this;
    }

    public ArrayPlay array(int[] array) {
        setArray(array);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " size='" + getSize() + "'" + ", array='" + getArray() + "'" + "}";
    }

    public static void main(String[] args) {

        ArrayPlay Ap1 = new ArrayPlay(new int[5], 5);
        for (int each : Ap1.getArray()) {
            System.out.println(each);
        }

    }

}
