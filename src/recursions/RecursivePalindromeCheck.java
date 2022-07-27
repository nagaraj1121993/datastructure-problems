package recursions;

public class RecursivePalindromeCheck {

    public static void main(String[] args) {
        RecursivePalindromeCheck recursivePalindromeCheck = new RecursivePalindromeCheck();
        int reverse = 0;
        int number = 12324;
        recursivePalindromeCheck.reverseOfNumber(number, reverse);
        if(reverse == number){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //String palindrome
        String str = "madam";
        System.out.println(recursivePalindromeCheck.isPalindromeForString(str,0, str.length()-1));
    }

    public Integer reverseOfNumber(int number, int reverse){
        if(number == 0){
            return reverse;
        }
        return reverseOfNumber(number/10, ((reverse*10)+(number % 10)));
    }

    public boolean isPalindromeForString(String str, int start, int end){
        if(start == end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && isPalindromeForString(str, start + 1, end - 1);
    }

}
