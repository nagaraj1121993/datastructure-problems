package recursions;

public class SumOfDigits {

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int sum = 0;
        System.out.println(sumOfDigits.sumOfDigits(98765, sum));
    }

    public Integer sumOfDigits(int number, int sum) {
        if(number == 0){
            return sum;
        }
        return sumOfDigits(number/10, (sum + number%10));
    }

}
