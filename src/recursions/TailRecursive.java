package recursions;

public class TailRecursive {

    public static void main(String[] args) {
        TailRecursive recursive = new TailRecursive();
        int temp = 1;
        System.out.println(recursive.tailRecursive(5, temp));
    }

    public Integer tailRecursive(int number, int temp){
        if(number == 0 || number == 1){
            return temp;
        }
        return tailRecursive(number - 1, temp * number);
    }

}
