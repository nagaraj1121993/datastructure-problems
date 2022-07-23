package mathematics;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        System.out.println(greatestCommonDivisor.greatestCommonDivisor(90,100));
        System.out.println(greatestCommonDivisor.greatestCommonDivisorRecursively(100, 200));
    }

    public Integer greatestCommonDivisor(Integer number1, Integer number2){
        int tempNumber = Math.min(number1, number2);
        int gcd = 0;
        for(int i = tempNumber/2; i > 0; i--){
            if(number1 % i == 0 && number2 % i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public Integer greatestCommonDivisorRecursively(Integer number1, Integer number2){
        if(number2 == 0){
            return number1;
        } else {
            return greatestCommonDivisorRecursively(number2, number1%number2);
        }
    }

}
