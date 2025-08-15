import java.util.*;

class Solution {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c != '*') {
                stack.push(c);
            } else if(!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        for(char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String WITH STARS");
        String str = sc.next();

        if (str.contains("*")) {            // Check if s contains a '*'
            String newS = removeStars(str);  // Call your removeStars function
            System.out.println(newS);      // Print the result
        }

        sc.close();
    }
}