package stacks;

import java.util.Objects;

public class MyStack {

    private Integer size;
    private final Integer capacity;
    private final Object[] stackArray;

    public MyStack(Integer capacity) {
        this.capacity = capacity;
        this.stackArray = new Integer[capacity];
        this.size = 0;
    }

    public void push(Object element) throws Exception {
        if(Objects.equals(size, capacity)) {
            throw new Exception("No size left to add element to stack");
        }
        this.stackArray[size] = element;
        this.size++;
    }

    public Object pop() throws Exception {
        if(size == 0) {
            throw new Exception("No element to remove from stack");
        }
        Object object = this.stackArray[size - 1];
        this.stackArray[size - 1] = null;
        this.size--;
        return object;
    }

    public Object top() {
        return this.stackArray[size - 1];
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Boolean isFull() {
        return Objects.equals(size, capacity);
    }

    public Integer size() { return size; }

}
