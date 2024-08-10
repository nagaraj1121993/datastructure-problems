package learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Map<Integer, Integer> countMap = new HashMap<>();
        for(Integer value : list){
            if(countMap.containsKey(value)){
                countMap.put(value, countMap.get(value)+1);
            } else {
                countMap.put(value, 1);
            }
        }

        countMap.keySet().stream().forEach(key -> System.out.println("Number "+ key +" Occured "+countMap.get(key)+ " Times"));
    }

}
