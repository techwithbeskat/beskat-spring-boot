package com.techtalkwithbeskat.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        // Create a HashSet of Integers
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        // Print the numbers in the set
        System.out.println("Numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
