package Labs.Java.Generic;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack;
    private int top = -1;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.stack = new ArrayList<T>();

    }

    public void push(T data) {
        if (top + 1 == size) { // Checking if array is full
            System.out.println("Stack Overflow");
        } else {
            top = top + 1; // Increment top to go to next position

            if (stack.size() > top) // Over-writing existing element
                stack.set(top, data);

            else
                stack.add(data);
        }
    }

    public T top() {
        if (top == -1) { // If stack is empty
            System.out.println("Stack Underflow");
            return null;
        } else
            return stack.get(top); // else return element at the top

    }

    public void pop() {
        // If stack is empty
        if (top == -1) {

            // Display message when there are no elements in
            // the stack
            System.out.println("Stack Underflow");
        }

        else

            // Delete the last element
            // by decrementing the top
            top--;
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return top == -1;
    }
}
