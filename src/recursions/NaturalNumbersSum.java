package recursions;

public class NaturalNumbersSum {

    public static void main(String[] args) {
        NaturalNumbersSum naturalNumbersSum = new NaturalNumbersSum();
        int sum = 0;
        System.out.println(naturalNumbersSum.sumOfNaturalNumbers(10, sum));
        System.out.println((10 * (10+1))/2);
    }

    public Integer sumOfNaturalNumbers(int number, int sum){
        if(number <= 0){
            return sum;
        }
        return sumOfNaturalNumbers(number-1, sum + number);
    }

}
