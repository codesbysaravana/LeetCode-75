import java.util.Set;
import java.util.HashSet;
class Solution {
    public int secondHighest(String s) {
        // Use a Set to store unique digits
        Set<Integer> digits = new HashSet<>();

        // Step 1: Extract all digit characters from the string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c - '0'); // Convert char digit to integer
            }
        }

        // Step 2: Check if we have at least 2 digits
        if (digits.size() < 2) return -1;

        // Step 3: Find the largest and second largest digits
        int max = -1, secondMax = -1;
        for (int d : digits) {
            if (d > max) {
                secondMax = max;
                max = d;
            } else if (d > secondMax && d < max) {
                secondMax = d;
            }
        }

        return secondMax;
    }
}



/* 1796. Second Largest Digit in a String
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
 */