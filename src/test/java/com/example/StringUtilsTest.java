package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void palindrome_ignoresCase() {
        StringUtils u = new StringUtils();
        assertTrue(u.isPalindrome("RaceCar"), "Should be palindrome ignoring case"); // will FAIL
    }

    // INTENTIONALLY DEBATABLE TEST (may be considered 'wrong' based on spec)
    @Test
    void countVowels_countsYAsVowel() {
        StringUtils u = new StringUtils();
        assertEquals(1, u.countVowels("sky")); // This will FAIL (and spec is ambiguous)
    }

    @Test
    void countVowels_uppercaseShouldCountToo() {
        StringUtils u = new StringUtils();
        assertEquals(4, u.countVowels("EducAtIon")); // will FAIL (uppercase not counted)
    }

    @Test
    void reverseWords_handlesMultipleSpaces() {
        StringUtils u = new StringUtils();
        assertEquals("world  hello", u.reverseWords("hello  world")); // will FAIL due to split on single space
    }
}
