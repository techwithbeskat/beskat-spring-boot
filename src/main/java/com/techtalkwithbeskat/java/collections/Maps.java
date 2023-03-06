package com.techtalkwithbeskat.java.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // Create a HashMap of Strings and Integers
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 40);

        // Print the ages in the map
        System.out.println("Ages:");
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + ": " + age);
        }
    }
}
