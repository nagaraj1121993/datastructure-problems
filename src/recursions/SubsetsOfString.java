package recursions;

public class SubsetsOfString {

    public static void main(String[] args) {
        SubsetsOfString subsetsOfString = new SubsetsOfString();
        String str = "ABC";
        subsetsOfString.subsets(str, "", 0);
    }

    public void subsets(String str, String empty, int length) {
        if(length > str.length()-1){
            System.out.println(empty);
            return;
        }
        subsets(str, empty, length+1);
        subsets(str, empty+str.charAt(length), length+1);
    }

}
