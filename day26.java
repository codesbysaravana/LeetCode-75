import java.util.*;

class Solution {
    public static boolean closeStrings(String word1, String word2) {
        
        // Step 1: If the words are not the same length, 
        // they can never be made into each other
        if (word1.length() != word2.length()) {
            return false;
        }

        // Step 2: Create two maps to store letter counts (frequencies)
        // fre1 -> counts for word1
        // fre2 -> counts for word2
        Map<Character,Integer> fre1 = new HashMap<>();
        Map<Character,Integer> fre2 = new HashMap<>();

        // Step 3: Count how many times each letter appears in word1
        for (char w1 : word1.toCharArray()) {
            fre1.put(w1, fre1.getOrDefault(w1, 0) + 1);
        }

        // Step 4: Count how many times each letter appears in word2
        for (char w2 : word2.toCharArray()) {
            fre2.put(w2, fre2.getOrDefault(w2, 0) + 1);
        }

        // Step 5: If the set of characters in word1 is not the same as in word2,
        // then they can never be transformed into each other
        // Example: "abc" vs "abb" → chars are different → return false
        if (!fre1.keySet().equals(fre2.keySet())) {
            return false;
        }

        // Step 6: Compare the *frequencies* of the characters (but not which letter)
        // Example: "aab" → counts [2,1], "bcc" → counts [1,2] → same pattern
        List<Integer> list1 = new ArrayList<>(fre1.values());
        List<Integer> list2 = new ArrayList<>(fre2.values());

        // Step 7: Sort the frequency lists so we can compare them
        Collections.sort(list1);
        Collections.sort(list2);

        // Step 8: If the sorted frequency lists match, return true
        // Otherwise, return false
        return list1.equals(list2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word1 = sc.next().trim();

        System.out.println("Enter a Another word: ");
        String word2 = sc.next().trim();

        boolean ans = closeStrings(word1, word2);
        System.out.println(ans);

        sc.close();
    }
}

/* 
2️⃣ Break the problem into two separate YES/NO checks
Think like a filter:
Same letters?
If one word has a letter the other doesn’t, no amount of swapping or rearranging will help.
So you need to check if set1 equals set2.
Same multiset of frequencies?
You can change which letter has which frequency, but you cannot invent or destroy counts.
So after sorting both frequency arrays, they should match.

3️⃣ Why two checks are needed
Example:
aab and abb → fail at set check? No, sets match {a, b}.
But sorted frequencies: [1, 2] vs [2, 1] → actually match, so ✅.
Another example:
abc and abd → fail immediately because sets differ.

4️⃣ Mental model
Think of each word as:
Bag of letters → must match
Bag of frequency numbers → must match
If both bags match, words are “close.”
 */


/*  Basically 
 same letters length
 same letters ------> HashMap
 same letters of frequency
 same frequency --------> Set and HashMap
 */