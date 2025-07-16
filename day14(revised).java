//THIS SUM REQUIRES TO INPLACE CHANGE THE CHARS
//and GIVE THE COUNT OF SAID CHARS

class Solution {
    public int compress(char[] chars) {
        //two pointers
        int write = 0;
        int i = 0;

        while( i<chars.length )
            {
                char current = chars[i]; //currrent char pointer
                int count = 0; //init counter for chars

                while(i<chars.length && chars[i] == current) {
                    i++; //to the next char in index;
                    count++; //cuzz we got same same chars[i] and current char
                }

                chars[write++] = current; //append the current character to to chars;

                //check if the count is >1
                if(count>1) {
                    for(char c : String.valueOf(count).toCharArray()) { //convertingg count to char
                        chars[write++] = c;
                        //WRITE AS TO WRITING ALONE WITH INDEX //appending the count !!
                    }
                }
            }
        return write; //write contains all the count index of said char
    }
}

// REMEMBER: always write the character first, then the count (if > 1)
// Final compressed output will look like --> ["a","2","b","2","c","3"]
