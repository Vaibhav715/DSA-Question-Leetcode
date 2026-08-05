class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0, sum = 0;
        for(int i = 0; i<accounts.length; i++){
            for(int j = 0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
            sum = 0;
        }
        return maxWealth;
    }
}