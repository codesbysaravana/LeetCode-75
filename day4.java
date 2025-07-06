//reverse string // before starting this think just plain left right pointer reversing ..//think plain nothing more
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        char temp;

        while(left<right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
    }
}

/* //remeber no slicing in java
so nuh nub no ---> s[::-1]; */
//
//and USE TWO POINTERS AS left and right
//THINK LIKE THIS ------>
//"What’s the first character in the reversed version?"
//"What’s the last character?"
//Realization:
//The first and last characters swap. So do the second and second-last. And so on.





/* 
❌ 3. You're using for (int i = 0; i < s.length; i++) with manual pointer logic (left, right) — but that's over-complicating it.
🧭 Cleaner idea:
Use a while (left < right) loop instead. Why?

Because:

You only care about left and right

The index i is not necessary here */



//AND REMEBER DONT OVEZRWRITE VALS i did before
//use temp