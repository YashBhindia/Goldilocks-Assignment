package com.goldilocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        map.put("Ram", 36);
        map.put("Shyam", 60);
        map.put("Mohan", 40);
        map.put("Sita", 70);
        map.put("Bharat", 90);

        String searchName = "Sita";
        
        if (map.containsKey(searchName)) {
            int age = map.get(searchName);
            System.out.println(searchName + "'s age is " + age);
        } else {
            System.out.println(searchName + " not found.");
        }
    }
}
