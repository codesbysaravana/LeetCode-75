class Solution {
    public boolean isSubsequence(String s, String t) {
        //two damn pointers
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++; //up i only if the s is in t
            }
            j++; //up normally no matter what
        }

        //return only if the s length is equal to i
        return i == s.length();
    }
}