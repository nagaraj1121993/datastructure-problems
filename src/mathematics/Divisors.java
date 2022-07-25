package mathematics;

import static java.lang.Math.floor;

public class Divisors {

    public static void main(String[] args) {
        Divisors divisors = new Divisors();
        divisors.printDivisors(15);
        divisors.printDivisorsSorted(15);
    }

    public void printDivisors(int number){
        if(number % 2 != 0){
            for(int i = 1; i * i <= number; i+=2){
                if(number % i == 0){
                    System.out.println(i);
                    if(i != number/i){
                        System.out.println(number/i);
                    }
                }
            }
        } else {
            for(int i = 1; i * i <= number; i+=1){
                if(number % i == 0){
                    System.out.println(i);
                    if(i != number/i){
                        System.out.println(number/i);
                    }
                }
            }
        }
    }

    public void printDivisorsSorted(int number){
        if(number % 2 != 0){
            for(int i = 1; i * i <= number; i+=2){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
            for(double i = floor(Math.sqrt(number)); i >= 1; i--){
                if(number % i == 0){
                    System.out.println((int)(number/i));
                }
            }
        } else {
            for(int i = 1; i * i <= number; i+=1){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
            for(double i = floor(Math.sqrt(number)); i >= 1; i--){
                if(number % i == 0){
                    System.out.println((int)(number/i));
                }
            }
        }
    }

}
