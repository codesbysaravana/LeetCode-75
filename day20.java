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