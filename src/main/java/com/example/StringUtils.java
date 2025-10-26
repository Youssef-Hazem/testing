package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringUtils {

    // BUG: case/spacing not normalized
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        // Normalize the string: remove non-alphanumeric chars and convert to lower case
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // BUG: counts only lowercase vowels
    public int countVowels(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouyAEIOUY";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            // Check if the current character is a vowel
            if (vowels.indexOf(chars[i]) >= 0) {
                // To count consecutive vowels as one, we only increment the count
                // if the PREVIOUS character was NOT a vowel.
                if (i == 0 || vowels.indexOf(chars[i - 1]) < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // BUG: splitting on single spaces only
    public String reverseWords(String s) {
        if (s == null) return null;
        // This implementation preserves multiple spaces as per the test expectation.
        String[] parts = s.split(" ");
        List<String> wordList = Arrays.asList(parts);
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}