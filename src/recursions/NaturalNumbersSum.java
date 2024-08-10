package recursions;

import java.util.*;

public class NaturalNumbersSum {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3};
        NaturalNumbersSum.printNumbersOnConditions(arr);
        String str = "nagaraj is from Bangalore and completed BE in Bangalore";
        NaturalNumbersSum.getStringOccurances(str);
    }

    // Employee Table
    /*
    * emp_name
    * emp_id
    * manager_id
    * */

    /*
    *
    * select * from Employees em inner join Employees mang on em.emp_id = mang.manager_id
    *
    * */

    public static void printNumbersOnConditions(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.keySet().contains(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        map.entrySet().forEach(data -> {
            if(data.getValue() > 1){
                System.out.println("Duplicate Entries "+ data.getKey());
            }
        });
        map.entrySet().forEach(data -> {
            if(data.getValue() == 1){
                System.out.println("Unique Entries "+ data.getKey());
            }
        });
        map.entrySet().forEach(data -> {
                System.out.println("All Non Duplicate Entries " + data.getKey());
        });
    }

    public static void getStringOccurances(String str){
        String[] strArr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strArr.length; i ++){
            if(map.containsKey(strArr[i])){
                map.put(strArr[i], map.get(strArr[i]) + 1);
            } else {
                map.put(strArr[i], 1);
            }
        }
        map.entrySet().forEach(data -> {
            System.out.println(data.getKey()+" has occured "+data.getValue()+" times");
        });
    }

}
