package stacks;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private final List<Integer> stackArray;
    private MyStack auxillaryArray;

    public MyStack() {
        this.stackArray = new ArrayList<>();
    }

    public void push(Integer element) throws Exception {
        this.stackArray.add(element);
    }

    public void pop() throws Exception {
        if(stackArray.isEmpty()) {
            throw new Exception("No element to remove from stack");
        }
        int size = stackArray.size();
        this.stackArray.remove(this.stackArray.get(size - 1));
    }

    public Integer top() {
        return this.stackArray.get(this.stackArray.size() - 1);
    }

    public Boolean isEmpty() {
        return stackArray.isEmpty();
    }

    public Integer size() { return stackArray.size(); }

    public void pushMin(Integer element) throws Exception {
        this.stackArray.add(element);
        if(auxillaryArray.top() >= this.top()) {
            auxillaryArray.push(this.top());
        }
    }

    public void popMin() throws Exception {
        if(stackArray.isEmpty()) {
            throw new Exception("No element to remove from stack");
        }
        if(this.top() == auxillaryArray.top()) {
            auxillaryArray.pop();
        }
        this.pop();
    }

    public Integer getMin() {
        return auxillaryArray.top();
    }

}
