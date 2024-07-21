package org.auto;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        String stringName = "ABC";

        try {
            List<String> itr = findPermutations(stringName);

            System.out.println("Permutations of " + stringName + ":");
            for (String permutation : itr) {
                System.out.println(permutation);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error throws: " + e.getMessage());
        }
    }

    // Function to find permutations of a string
    public static List<String> findPermutations(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty");
        }

        List<String> result = new ArrayList<>();
        permute("", str, result);
        return result;
    }

    // Recursive function to generate permutations
    private static void permute(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n),
                        result);
            }
        }
    }
}
