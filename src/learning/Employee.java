package learning;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

    int id;
    String name;
    List<String> address;

    private Employee(int id, String name, List<String> address){
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public static void main(String[] args) {
        String s = "This is india";
        String s1 = new String("This is india");
        getCharOccurance(s);
    }

    public static void getCharOccurance(String s){
        char[] charrArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < charrArr.length; i++){
            if(map.containsKey(charrArr[i])){
                map.put(charrArr[i], map.get(charrArr[i])+1);
            } else {
                map.put(charrArr[i], 1);
            }
        }
        map.entrySet().forEach(entry -> {
            System.out.println("Char "+entry.getKey()+" is repeated "+ entry.getValue()+" times");
        });
    }

}


