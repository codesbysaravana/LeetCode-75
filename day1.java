class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        while (i < len1 || j < len2) {
            if (i < len1) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < len2) {
                merged.append(word2.charAt(j));
                j++;
            }
        }
        
        return merged.toString();
    }
}

/* 
Question
We are given two strings word1 and word2.
Our task is to merge the strings by adding letters in alternating order, starting with word1. If one string is longer than the other, the additional letters must be appended to the end of the merged string. */