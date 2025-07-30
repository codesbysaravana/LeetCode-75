import java.util.Scanner;
/* 1. Set up a variable to track vowels: "aeiou"
2. Loop through first k characters of the string:
   - Count how many vowels are there → currentCount
3. Set maxCount = currentCount
4. Slide the window:
   - At each step:
     - Remove the effect of the character going out of the window (i - k)
     - Add the effect of the new character entering (i)
     - Update maxCount if currentCount is higher
5. Return maxCount
 */

class Solution {
    public static int maxVowels(String s, int k) {
        int currentCount=0;
        String vowels = "aeiou";
        
        //Initiak Window!
        for(int i=0; i<k; i++) {
            //looping good...but to check if theres a vowel:
            if(vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++; //if vowels present in ... up the current Count
            }
        }

        int maxCount = currentCount;

        for(int i = k; i < s.length(); i++) {
            //if vowel present then remove slide the window
            if(vowels.indexOf(s.charAt(i -k)) != -1) {{
                currentCount--; //remove prev window  stuff
            }}

            //if vowel present then add to slide the window
            if(vowels.indexOf(s.charAt(i)) != -1) {{
                currentCount++; //add next window  stuff
            }}

            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
         // 1. Read input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the window size (k): ");
        int k = sc.nextInt();
        sc.close();

        // 2. Call function to find max vowels
        int result = maxVowels(s, k);
        System.out.println("Maximum number of vowels in any substring of size " + k + " is: " + result);

    }
}






//bascially: 
      /* this line 
        (vowels.indexOf(s.charAt(i -k))) 
                if  -1? ----> not a Vowel
                else 0? ---> it is a Vowel */ //so ? -1 not then Vowel!





/* 🔍 Now, this line:
java
Copy
Edit
if(vowels.indexOf(s.charAt(i)) != -1)
Means:

"Is the character at position i a vowel?"

Let’s go slow:

s.charAt(i) gives you a single character, like 'a'

vowels = "aeiou"

vowels.indexOf('a') returns 0 (means 'a' is at index 0 in "aeiou")

vowels.indexOf('z') returns -1 (means 'z' is NOT in "aeiou")

So if indexOf(...) != -1, it means it's a vowel ✅
If indexOf(...) == -1, it means it's not a vowel ❌

 */









/* ### Sliding Window Approach: Max Vowels in Substring

1. Define a `vowels` string: `"aeiou"`.
2. Create an initial count of vowels in the first `k` characters.
3. Store this in `currentCount` and initialize `maxCount = currentCount`.
4. Slide the window one character at a time from index `k` to `s.length() - 1`:
   - Subtract 1 if `s[i - k]` is a vowel (leftmost out).
   - Add 1 if `s[i]` is a vowel (new rightmost in).
   - Update `maxCount = max(maxCount, currentCount)`.
5. Return `maxCount`.
 */