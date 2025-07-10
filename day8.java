class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //starting finding the current kid with maxCandies;
        //finding maxCandie as before itself...note the approach
        //as a bench mark point
        int maxCandies = 0;
        for(int c:candies) {
            if(c>maxCandies) {
                maxCandies = c;
            }
        }


        //before looping checks,,, need a new List of boolean
        List<Boolean> result = new ArrayList<>();

        //looping thru each kid to see with +maxCandie
        for(int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies >= maxCandies) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}