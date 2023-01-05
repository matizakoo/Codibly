package org.example;

import java.util.HashMap;
import java.util.Map;

public class Words {
    public int count(String input) throws Exception {
        if (input == null) {
            throw new Exception("null");
        }

        if (!input.matches("[a-zA-Z]+")) {
            throw new Exception("Only letters");
        }

        if (input.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : input.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        for (int i = 1; i <= input.length(); i++) {
            result += countBalancedWordsOfLength(input, i, counts);
        }
        return result;
    }

    private int countBalancedWordsOfLength(String input, int length, Map<Character, Integer> counts) {
        int result = 0;
        for (int i = 0; i <= input.length() - length; i++) {
            String subword = input.substring(i, i + length);
            if (isBalanced(subword, counts)) {
                result++;
            }
        }
        return result;
    }

    private boolean isBalanced(String word, Map<Character, Integer> counts) {
        Map<Character, Integer> countsCopy = new HashMap<>(counts);
        for (char c : word.toCharArray()) {
            int count = countsCopy.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            countsCopy.put(c, count - 1);
        }
        return true;
    }
}
