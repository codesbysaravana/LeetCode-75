/* //THIS SUM REQUIRES TO INPLACE CHANGE THE CHARS
//and GIVE THE COUNT OF SAID CHARS


class Solution {
    public int compress(char[] chars) {
        //initialize pointers 
        int write = 0; // to write compressed chars;
        int i = 1;  // Pointer to read original characters

        while(i < chars.length) {
            char current = chars[i];
            int count = 0; //reset the count for this group eg--> a

            //Step1: first check ig < length and the  current is == chars[i]
            while(i < chars.length && chars[i] == current) {
                i++; //up the readin og i
                count++; //up the counter cuz  current is == chars[i]
            } 

            chars[write++] = count; //put the count of said char to the next of it;
        }

        return chars.length;
    }
}

//remeber the count is always 1 ---> if more than one then the magic happens
//gotta assume that the count is one and if the the current is == chars[i]

//REMEBER THE CURRENT STRUCTURE output must be --------> ["a","2","b","2","c","3"]
//soo add the  count after number with current

 */


//THIS SUM REQUIRES TO INPLACE CHANGE THE CHARS
//and GIVE THE COUNT OF SAID CHARS

class Solution {
    public int compress(char[] chars) {
        int write = 0; // to write compressed chars
        int i = 0;     // read pointer

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // Step1: check while i < len and current is same
            while (i < chars.length && chars[i] == current) {
                i++;       // read next
                count++;   // increment count of group
            }
            //inside the write++
            chars[write++] = current; // write the current char 

            // Step2: if count > 1, write digits of the count
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) { //changin the count from int to char array
                    chars[write++] = c; //appending said char count after the variable
                }
            }
        }

        return write; // return compressed length
    }
}

// REMEMBER: always write the character first, then the count (if > 1)
// Final compressed output will look like --> ["a","2","b","2","c","3"]
