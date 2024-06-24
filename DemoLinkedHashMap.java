package com.newapjfsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

    public static void main(String[] args) {

        // Initializing LinkedHashMap to store countryCodes
        LinkedHashMap<String, Integer> countryCodes = new LinkedHashMap<>();

        // Add country codes
        countryCodes.put("US", 1);
        countryCodes.put("India", 91);
        countryCodes.put("Russia", 7);
        countryCodes.put("Australia", 61);
        countryCodes.put("China", 86);
        countryCodes.put("Pakistan", 92);

        // Print the LinkedHashMap
        System.out.println("Country Codes: " + countryCodes);

        // Retrieve and print India's country code
        System.out.println("The country code for India is: " + countryCodes.get("India"));

        // Check if China is in the map
        if (countryCodes.containsKey("China")) {
            System.out.println("China is in the map.");
        }

        // Check if the code 92 exists
        if (countryCodes.containsValue(92)) {
            System.out.println("The country code 92 exists in the map.");
        }

        // Remove Russia from the map
        countryCodes.remove("Russia");
        System.out.println("After removing Russia: " + countryCodes);


        // Clear the LinkedHashMap
        countryCodes.clear();
        System.out.println("After clearing the LinkedHashMap: " + countryCodes);
    }
}
