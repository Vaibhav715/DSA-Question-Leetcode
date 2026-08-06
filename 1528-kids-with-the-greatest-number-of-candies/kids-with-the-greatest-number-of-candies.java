class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> list = new ArrayList<>();
        for(int i = 0 ; i<candies.length; i++){
            if(candies[i] > maxCandies)
            maxCandies = candies[i];
        }

        for(int i = 0 ; i<candies.length; i++){
            if(candies[i]+extraCandies >= maxCandies)
            list.add(true);
            else
            list.add(false);
        }
        return list;
    }

}