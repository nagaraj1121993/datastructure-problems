package mathematics;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        System.out.println(checkPrimeNumber.isPrime(49));
    }

    /**
     * If number is not a prime, it can be factored into two factors a and b:
     *
     * number = a * b
     * Now a and b can't be both greater than the square root of number, since then the product
     * a * b would be greater than sqrt(number) * sqrt(number) = number. So in any factorization of number,
     * at least one of the factors must be smaller than the square root of number,
     * and if we can't find any factors less than or equal to the square root, n must be a prime.
     *
     *
     * we can avoid numbers divisible by 2 & 3 to reduce the number of iterations
     * **/
    public boolean isPrime(int number){
        if(number == 1) {
            return false;
        }
        if(number ==2 || number == 3){
            return true;
        }
        if(number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for(int i = 5; i <= Math.sqrt(number); i+=6){
            if(number%i == 0 || number%(i+2) == 0){
                return false;
            }
        }
        return true;
    }

}
