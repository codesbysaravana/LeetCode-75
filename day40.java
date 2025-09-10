import java.util.*;

class Solution {
    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word into sorted form
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            // Add to map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        // Collect all groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: read number of words
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        List<List<String>> res = groupAnagram(strs);
        System.out.println(res);

        sc.close();
    }
}












class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Use a HashMap where:
        // key   -> sorted word (e.g., "aet")
        // value -> list of anagrams of that word (["eat","tea","ate"])
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array and sort it
            // So all anagrams share the same sorted key
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            // If this sorted key doesn't exist, create a new empty list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // Add the original word into the list for this key
            map.get(sorted).add(word);
        }

        // Return all groups of anagrams
        return new ArrayList<>(map.values());
    }
}
