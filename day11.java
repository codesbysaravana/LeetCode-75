class Solution {
    public String reverseWords(String s) {
        String trimmedver = s.trim(); //to remove leading and trailing zeros;
        String[] words = trimmedver.split("\\s+"); //split the trimmed string by one or more spaces

        //two pointer left end and right;
        int left = 0, right = words.length -1;

        //reversing the trimmmed array
        while(left<right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        } 

        // Step 4: Join the words with a single space
        return String.join(" ", words);
    }
}