class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int runningSum = 0, count = 0;
        for(int i = 0; i<nums.length; i++){
            runningSum += nums[i];
            count += map.getOrDefault(runningSum-k,0);
            map.put(runningSum, map.getOrDefault(runningSum,0)+1);  
        }
        return count;
    }
}