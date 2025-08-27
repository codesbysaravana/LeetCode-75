import java.util.*;

class Solution {
    public static int lengthOfLongSub(String s) {
        int left = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++; // shrink window
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1); // ✅ fixed //right - left + 1 = current valid window length
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int lengthOfMaxSub = lengthOfLongSub(s);
        System.out.println("The Length of max SubString: " + lengthOfMaxSub);

        sc.close();
    }
}
