package Class_Period;

import java.util.*;

public class Collections_Demo {
    public static void main(String[] args) {
        
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

       
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);

       
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

       
        Collections.sort(myList);
        int max = Collections.max(mySet);

       
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}