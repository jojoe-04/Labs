package School;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

    private List<T> elements;

    /**
     * Default Constructor
     */
    public Bag() {
        elements = new ArrayList<>();
    }

    /**
     * @brief Add to element to Bag
     * @param element
     */
    public void add(T element) {
        this.elements.add(element);
    }

    /**
     * @brief Remove element from bag
     * @param element
     */
    public void remove(T element) {
        this.elements.remove(element);
    }

    /**
     * @brief Remove all elements from Bag
     */
    public void clear() {
        this.elements.clear();
    }

    /**
     * @brief display all elements in List
     */
    public void display(){
        this.elements.stream().map(x -> x).forEach(System.out::println);
    }

}
