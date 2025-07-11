class Solution {
    public String reverseVowels(String s) {
        // creating a list of vowels to check against (both lowercase and uppercase)
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

        // since s is a String ... convert it to a char array (because Strings are immutable)
        char[] schars = s.toCharArray(); 
        
        // using two pointers — one from start and one from end
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // move the left pointer forward if it's not pointing to a vowel
            if (!vowels.contains(schars[left])) {
                left++;
                continue;
            }

            // move the right pointer backward if it's not pointing to a vowel
            if (!vowels.contains(schars[right])) {
                right--;
                continue;
            }

            // swap the vowels at left and right pointers
            char temp = schars[left]; // use schars because we changed s to schars
            schars[left] = schars[right];
            schars[right] = temp;

            // move both pointers inward
            left++;
            right--;
        }

        // returning a new String from the modified char array
        return new String(schars);
    }
}
