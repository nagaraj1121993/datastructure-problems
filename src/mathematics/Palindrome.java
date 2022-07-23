package mathematics;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeNumeric(78987));
        System.out.println(palindrome.isPalindromeNumeric(789887));
    }

    public boolean isPalindrome(Integer number){
        String num = number.toString();
        for(int i = 0, j = num.length()-1; i <= num.length()/2 && j >= num.length()/2; i++, j--){
            if(num.charAt(i) == num.charAt(j)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeNumeric(Integer number){
        int newNumber = 0;
        int temp = number;
        while(temp != 0){
            newNumber = (newNumber * 10) + (temp % 10);
            temp = temp / 10;
        }
        return newNumber == number;
    }

    //Yet to figure out a way for recursive approach
    public Integer isPalindromeRescursively(Integer number){
        int newNumber = 0;
        if(newNumber <= 0){
            return 0;
        }
        newNumber = (newNumber*10) + (isPalindromeRescursively(number)%10);
        number = number/10;
        if(newNumber == number){
            return 1;
        } else {
            return 0;
        }
    }

}
