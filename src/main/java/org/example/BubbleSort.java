package org.example;

import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> input) {
        if (input == null)
            throw new RuntimeException("null");

        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (input.get(j) != null && input.get(j + 1) != null && input.get(j).compareTo(input.get(j + 1)) > 0) {
                    Comparable temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, (Integer) temp);
                }
            }
        }
        return input;
    }
}
