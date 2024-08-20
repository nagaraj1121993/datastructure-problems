package stacks;

import java.util.ArrayDeque;

public class PreviousClosestGreaterElement {

    public static void main(String[] args) {
        int[] arr = {12, 45, 32, 67, 1, 45, 12};
        printPreviousClosestGreaterElement(arr);
    }

    private static void printPreviousClosestGreaterElement(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        System.out.print(-1);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            System.out.print(!stack.isEmpty() ? arr[stack.peek()] : -1);
            stack.push(i);
        }
    }

}
