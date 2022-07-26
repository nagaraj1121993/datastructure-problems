package recursions;

public class BinaryOfNumber {

    public static void main(String[] args) {
        BinaryOfNumber number = new BinaryOfNumber();
        number.printBinaryOfNumber(13);
    }

    public void printBinaryOfNumber(int number){
        if(number == 0){
            return;
        }
        printBinaryOfNumber(number/2);
        System.out.println(number % 2);
    }

}
