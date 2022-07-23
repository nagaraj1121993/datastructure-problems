package mathematics;

public class PrimeFactors {

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.printPrimeFactors(84);
        primeFactors.printPrimeFactorsEfficientApproach(84);
    }

    public void printPrimeFactors(int number){
        if(number <= 1) return;
        for (int i = 2; i * i <= number; i++){
            while(number % i == 0){
                System.out.println(i);
                number /= i;
            }
        }
        if(number > 1) System.out.println(number);;
    }

    public void printPrimeFactorsEfficientApproach(int number){
        if(number <= 1) return;
        while(number % 2 == 0){
            System.out.println(2);
            number = number/2;
        }
        while(number % 3 == 0){
            System.out.println(3);
            number = number/3;
        }
        for (int i = 5; i * i <= number; i+=6){
            while(number % i == 0){
                System.out.println(i);
                number /= i;
            }
            while(number % (i+2) == 0){
                System.out.println(i+2);
                number /= (i+2);
            }
        }
        if(number >= 1) System.out.println(number);;
    }

}
