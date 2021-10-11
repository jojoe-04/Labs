package Labs.Java.OptionalType;

import java.util.Optional;

public class OptionalTypeDemo {

    public static void main(String[] args) {
        // public Optional<V> get(Object key){

        // };

        Integer value1 = null;
        Integer value2 = Integer.valueOf(10);

        // Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);

        Integer value11 = a.orElse(1);
        Integer value12 = b.get();

        System.out.println(value11 + value12);

    }

}
