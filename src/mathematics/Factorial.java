package mathematics;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(4));
    }

    public Integer factorial(Integer number) {
        if(number == 0){
            return 1;
        }
        return number * factorial(number-1);
    }

}
