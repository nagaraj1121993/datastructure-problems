package stacks;

import java.util.*;

public class NextClosestGreaterElement {

    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        printNextClosestGreaterNumbers(arr);
    }

    private static void printNextClosestGreaterNumbers(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        stack.push(arr.length - 1);
        list.add(-1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            list.add(!stack.isEmpty() ? arr[stack.peek()] : -1);
            stack.push(i);
        }
        Collections.reverse(list);
        System.out.println(list);
    }

}
