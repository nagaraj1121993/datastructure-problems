package mathematics;

public class ComputingPower {

    public static void main(String[] args) {
        ComputingPower power = new ComputingPower();
        System.out.println(power.computePower(3,4));
        System.out.println(power.computePowerEfficientApproach(3, 4));
        System.out.println(power.computePowerIterativeApproach(3, 5));
    }

    public Integer computePower(int number, int power){
        int temp = 1;
        for (int i = 0; i < power; i++) {
            temp = temp * number;
        }
        return temp;
    }

    public Integer computePowerEfficientApproach(int number, int power){
        if(power == 0) {
            return 1;
        }
        int temp = computePowerEfficientApproach(number, power/2);
        temp = temp * temp;
        if(power % 2 == 0){
            return temp;
        } else {
            return temp * number;
        }
    }

    public Integer computePowerIterativeApproach(int number, int power){
        int temp = 1;
        while (power > 0){
            if(power % 2 != 0){
                temp = temp * number;
            }
            power /= 2;
            number *= number;
        }
        return temp;
    }

}
