class Solution {
    public int findNumbers(int[] nums) {
        int count = 0, evenNums = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0) continue;
            int item = nums[i];
            while( item > 0){
                count++;
                item = item / 10;
            }
            if(count % 2 == 0) evenNums++;
            count = 0;
        }
        return evenNums;
    }
}