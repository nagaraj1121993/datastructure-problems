package stacks;

public class MyStackTest {

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(10);
        myStack.push(123);
        System.out.println(myStack.top());
        myStack.push(143);
        System.out.println(myStack.top());
        myStack.push(162);
        System.out.println(myStack.top());
        System.out.println(myStack.size());
        myStack.pop();
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println(myStack.size());
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
    }

}
