class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; 
        } //when they  both are added forms other then
        
        int str1len = str1.length();  
        int str2len = str2.length();  

        int len = gcd(str1len, str2len);
        return str1.substring(0, len); //return substring of gcd length
    }

    // GCD function outside the main method
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
