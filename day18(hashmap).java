class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sumOfOperations = 0;

        for(int num : nums) {
            int complement = k - num;
            if(map.getOrDefault(complement, 0) > 0) {
                //Found Pair and since already in map hash 
                sumOfOperations++; //increase the operation count possible
                //remove the nums cuz operation successful 
                map.put(complement, map.get(complement) -1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return sumOfOperations;
    }
}


/* 

🔢 Problem Summary
Given an integer array nums and an integer k, your task is to return the maximum number of operations you can perform where:

You pick two numbers from the array such that their sum is equal to k, and

Remove those two numbers from the array.

You can only use each number once per operation.

✅ Example
java
Copy
Edit
nums = [1, 2, 3, 4], k = 5
Operations:

1 + 4 = 5 ✅ → remove both → [2, 3]

2 + 3 = 5 ✅ → remove both → []

Result: 2 operations

👨‍🏫 Intuition (How to Think)
Let’s try all elements one by one:

If we pick num, we want to find its complement = k - num

If we already saw the complement before, we can form a pair!

So we store seen numbers (and how many times we've seen them) in a map

🔄 Walkthrough with Map
Let’s do this example step by step:

java
Copy
Edit
nums = [1, 2, 3, 4], k = 5
map = {}, operations = 0

Step 1: num = 1 → complement = 4 → not in map → store 1 → map = {1:1}
Step 2: num = 2 → complement = 3 → not in map → store 2 → map = {1:1, 2:1}
Step 3: num = 3 → complement = 2 → map has 2! → operation++ → remove 2 from map → map = {1:1, 2:0}
Step 4: num = 4 → complement = 1 → map has 1! → operation++ → remove 1 from map → map = {1:0, 2:0}










//🔍 Step-by-step Breakdown:
/* 1. Arrays.asList(1, 2, 3, 4)
Converts the given elements into a fixed-size list.

Result: List<Integer> containing [1, 2, 3, 4].

BUT: This list has fixed size (you can't add/remove elements directly).

2. new ArrayList<>(...)
Wraps the fixed-size list into a dynamic ArrayList.

Now you can use .add(), .remove(), etc.

3. List<Integer> numsList
Declares numsList as a variable of type List<Integer> (Java's generic list of integers).

 */ 