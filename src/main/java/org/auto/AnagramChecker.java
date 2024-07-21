package org.auto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Write a function that checks if two given strings are anagrams of each other
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        try {
            boolean areAnagrams = areAnagrams(str1, str2);

            if (areAnagrams) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        try {
            // If lengths are different, they cannot be anagrams
            if (s1.length() != s2.length()) {
                throw new IllegalArgumentException("Strings must have the same length to be anagrams.");
            }

            // Use HashMap to count characters in each string
            Map<Character, Integer> charCountMap1 = buildCharCountMap(s1);
            Map<Character, Integer> charCountMap2 = buildCharCountMap(s2);

            // Compare character count maps
            return charCountMap1.equals(charCountMap2);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error while checking anagrams: " + e.getMessage());
        }
    }

    // Helper function to build character count map for a string
    private static Map<Character, Integer> buildCharCountMap(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
