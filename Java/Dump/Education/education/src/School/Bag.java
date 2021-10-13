package School;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

    private List<T> elements;

    public Bag() {
        elements = new ArrayList<T>();
    }

    // add elements
    public void add(T element) {
        this.elements.add(element);
    }

    public void remove(T element) {
        this.elements.remove(element);
    }

    public void clear() {
        this.elements.clear();
    }

}
