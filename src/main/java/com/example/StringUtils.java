package com.example;

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
        if (s == null) return 0;
        int c = 0;
        // Convert the string to lower case to count both upper and lower case vowels
        for (char ch : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) c++;
        }
        return c;
    }

    // BUG: splitting on single spaces only
    public String reverseWords(String s) {
        if (s == null) return null;
        // Trim leading/trailing whitespace and split by one or more spaces
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            sb.append(parts[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}