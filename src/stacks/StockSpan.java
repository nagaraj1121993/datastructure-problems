package stacks;

import java.util.ArrayDeque;

public class StockSpan {

    public static void main(String[] args) {
        int[] arr = {100, 23, 45, 89, 5, 9, 34, 98, 304, 394};
        printSpan(arr, arr.length);
    }

    private static void printSpan(int[] arr, int n) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        System.out.println(1);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            int span = !stack.isEmpty() ? i - stack.peek() : i + 1;
            System.out.println(span);
            stack.push(i);
        }
    }

}
