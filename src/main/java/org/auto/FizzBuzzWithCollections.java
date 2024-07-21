package org.auto;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzWithCollections {
    public static void main(String[] args) {
        try {
            List<String> fizzBuzzList = generateFizzBuzzList();

            for (String result : fizzBuzzList) {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    // Function to generate FizzBuzz list
    public static List<String> generateFizzBuzzList() {
        List<String> fizzBuzzList = new ArrayList<>();

        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzzList.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    fizzBuzzList.add("Fizz");
                } else if (i % 5 == 0) {
                    fizzBuzzList.add("Buzz");
                } else {
                    fizzBuzzList.add(String.valueOf(i));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error generating FizzBuzz list: " + e.getMessage());
        }

        return fizzBuzzList;
    }
}
