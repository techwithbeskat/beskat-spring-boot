package com.techtalkwithbeskat.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the names in the list
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
