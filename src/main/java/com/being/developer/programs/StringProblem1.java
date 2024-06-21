package com.being.developer.programs;

import java.io.*;
import java.util.*;

/**
 * There is a string of english alphabets. The string is repeated many times.
 * Given a letter n and the string, find the number of occurrences of the letter n in the string.
 * This Java program solves the problem of finding the maximum occurrence of any character in a repeated string.
 * 
 * For example, if the input string 's' is "abc" and 'n' is 10, the repeated string will be "abcabcabca". 
 * The maximum occurrence of any character is 4 (for 'a'), so the method returns 4.
 * 
 * Note: This program uses a BufferedReader for reading input and a BufferedWriter for writing the output to a file named "output.txt".
 */
// Problem Statement: https://www.hackerrank.com/challenges/repeated-string/problem
public class StringProblem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static long repeatedString(String s, long n) {
        if (Objects.isNull(s))
            return 0;
        long pages = n / s.length();
        long remaingChar = n % s.length();
        String mainStr = "";
        for (long page = 0; page < pages; page++) {
            mainStr = mainStr + s;
        }
        if (remaingChar > 0) {
            String remainString = s.substring(0, (int) remaingChar);
            System.out.println(remainString);
            mainStr = mainStr + remainString;
        }
        System.out.println(mainStr);

        Map<Character, Long> map = new HashMap<>();
        for (Character c : mainStr.toCharArray()) {
            Long count = map.get(c);
            if (count != null) {
                map.put(c, count + 1);
            } else {
                map.put(c, 1L);
            }
        }
        System.out.println(map.values());
        long max = map.values().stream().max(Long::compare).get();
        return max;

    }
}
