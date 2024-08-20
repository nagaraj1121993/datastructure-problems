package stacks;

import java.util.ArrayDeque;

public class LargestRectangularArea {

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1, 5, 6};
        System.out.println(printLargestRectangularArea(arr));
    }

    private static int printLargestRectangularArea(int[] arr) {
        int n = arr.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int top = stack.pop();
                int curr = arr[top] * (!stack.isEmpty() ? (i - stack.peek() - 1) : i);
                res = Math.max(res, curr);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int curr = arr[top] * (!stack.isEmpty() ? (n - stack.peek() - 1) : n);
            res = Math.max(res, curr);
        }
        return res;
    }

}
