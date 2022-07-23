package mathematics;

public class LeastCommonFactor {

    public static void main(String[] args) {
        LeastCommonFactor leastCommonFactor = new LeastCommonFactor();
        System.out.println(leastCommonFactor.leastCommonFactor(4,6));
        System.out.println(leastCommonFactor.leastCommonFactorEfficientApproach(4,6));
    }

    public Integer leastCommonFactor(int number1, int number2){
        int res = Math.max(number1, number2);
        for(int i = res; i > 0; i++){
            if(i % number1 == 0 && i % number2 == 0){
                res = i;
                break;
            }
        }
        return res;
    }

    public Integer leastCommonFactorEfficientApproach(int number1, int number2){
        return (number1 * number2) / greatestCommonDivisorRecursively(number1, number2);
    }

    public Integer greatestCommonDivisorRecursively(Integer number1, Integer number2){
        if(number2 == 0){
            return number1;
        } else {
            return greatestCommonDivisorRecursively(number2, number1%number2);
        }
    }

}
