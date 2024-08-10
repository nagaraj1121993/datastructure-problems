package arrays;

import util.ArrayUtil;

public class RightRotateArrayKTimes {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int k = 2;
        rightRotate(arr, arr.length, k);
        ArrayUtil.printArrayElements(arr);
    }

    private static void rightRotate(int[] arr, int length, int k) {
        while(k > 0) {
            for(int i = length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            k--;
        }
    }

}
