package mathematics;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(4));
        System.out.println((int)factorial.digitsInFactorial(42));
    }

    public Integer factorial(Integer number) {
        if(number == 0){
            return 1;
        }
        return number * factorial(number-1);
    }

    public double digitsInFactorial(int N){
        // code here
        if(N == 0){
            return 1;
        }
        return (Math.log10((double)N) + (digitsInFactorial(N-1)));
    }

}
