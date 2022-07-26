package mathematics;

import java.util.Arrays;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        PrintPrimeNumbers printPrimeNumbers = new PrintPrimeNumbers();
//        printPrimeNumbers.printPrimeNumbers(23);
        printPrimeNumbers.printPrimeNumbersEfficientApproach(23);
    }

    /*
    * Time complexity of this approach is O(n Math.sqrt(n))
    * */
    public void printPrimeNumbers(int number) {
        if(number >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i <= number; i+=2){
            CheckPrimeNumber isPrimeNumber = new CheckPrimeNumber();
            if(isPrimeNumber.isPrime(i)){
                System.out.println(i);
            }
        }
    }

    /*
     * Time complexity of this approach is O(n)
     * Sieve of Eretosthenes
     * */
    public void printPrimeNumbersEfficientApproach(int number) {
        boolean[] array = new boolean[number+1];
        Arrays.fill(array, true);
        for(long i = 2; i <= number; i++){
            if(array[(int)i]){
                System.out.println(i);
                for(long j = i*i; j <= number; j=j+i){
                    array[(int)j] = false;
                }
            }
        }
    }

}
