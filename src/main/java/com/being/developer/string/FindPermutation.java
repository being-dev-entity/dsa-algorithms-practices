package com.being.developer.string;

import java.util.*;

public class FindPermutation {
    public static void main(String[] args) {
        System.out.println("Find All Permutation example!");
        String input = "abc";
        List<String> permutations = findPermutations(input);
        for (String value : permutations) {
            System.out.println(value);
        }
        // abc,acb,bca,bac,cab,cba
    }

    private static List<String> findPermutations(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return result;
        }

        Queue<String> permutationsQueue = new LinkedList<>();
        permutationsQueue.add("");

        for (char c : input.toCharArray()) {
            int size = permutationsQueue.size();
            for (int i = 0; i < size; i++) {
                String perm = permutationsQueue.poll();
                for (int j = 0; j <= perm.length(); j++) {
                    String newPerm = perm.substring(0, j) + c + perm.substring(j);
                    permutationsQueue.add(newPerm);
                }
            }
        }

        result.addAll(permutationsQueue);
        
        return result;
    }
}
