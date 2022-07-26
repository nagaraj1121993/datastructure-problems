package recursions;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {
        PrintConsecutiveNumbers consecutiveNumbers = new PrintConsecutiveNumbers();
        consecutiveNumbers.print1toN(13);
        System.out.println();
        consecutiveNumbers.printNto1(13);
    }

    public void print1toN(int number){
        if(number == 0){
            return;
        }
        print1toN(number - 1);
        System.out.print(number + " ");
    }

    public void printNto1(int number){
        if(number == 0){
            return;
        }
        System.out.print(number + " ");
        printNto1(number - 1);
    }

}
