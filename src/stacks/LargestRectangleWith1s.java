package stacks;

public class LargestRectangleWith1s {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 1, 1},{0, 0, 0, 1, 1},{1, 1, 1, 1, 1},{0, 1, 1, 1, 1}};
        System.out.println(printMaxRectangle(arr));
    }

    private static int printMaxRectangle(int[][] arr) {
        int res = LargestRectangularArea.printLargestRectangularArea(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j];
                }
            }
            res = Math.max(res, LargestRectangularArea.printLargestRectangularArea(arr[i]));
        }
        return res;
    }

}
