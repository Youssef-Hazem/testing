package com.example;

public class StringUtils {

    // BUG: case/spacing not normalized
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // BUG: counts only lowercase vowels
    public int countVowels(String s) {
        if (s == null) return 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) c++;
        }
        return c;
    }

    // BUG: splitting on single spaces only
    public String reverseWords(String s) {
        if (s == null) return null;
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            sb.append(parts[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
