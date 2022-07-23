package mathematics;

import java.math.BigInteger;

public class TrailingZerosInFactorial {

    public static void main(String[] args) {
        TrailingZerosInFactorial trailingZerosInFactorial = new TrailingZerosInFactorial();
        System.out.println(trailingZerosInFactorial.trailingZeros(100));
        System.out.println(trailingZerosInFactorial.trailingZeroesByApproach2(125));
    }

    public Integer trailingZeros(Integer number){
        BigInteger factorial = factorial(number);
        int trailCount = 0;
        BigInteger temp = factorial;

        while(!temp.equals(0)){
            BigInteger val = temp.remainder(new BigInteger("10"));
            if(val.equals(BigInteger.valueOf(0))){
                trailCount = trailCount + 1;
                temp = temp.divide(BigInteger.valueOf(10));
                continue;
            } else {
                break;
            }
        }
        return trailCount;
    }

    public BigInteger factorial(Integer number){
        if(number == 0) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(number).multiply(factorial(number-1));
    }

    public Integer trailingZeroesByApproach2(Integer number){
        int res = 0;
        for(int i = 5; i <= number; i *= 5){
            res =res + number/i;
        }
        return res;
    }

}
