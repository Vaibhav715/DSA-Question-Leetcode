class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int missing_num = 0;

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],1);
        }
        for(int i = 0; i<=nums.length; i++){
           if(!map.containsKey(i))
           missing_num = i;  
        }
        return missing_num;
    }
}