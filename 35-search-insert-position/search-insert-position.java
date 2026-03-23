class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = -1;
        for(int i = 0;i<nums.length;i++){
            if(target == nums[i])
            position = i;
        }
        if(position == -1)
        {
            
            for(int i = 0;i<nums.length;i++){
                if(target < nums[i]){
                position = i;
                break;
                }
            }

            if(target < nums[0])
            position = 0;

            if(target > nums[nums.length-1])
            position = nums.length;
        }
        return position;
    }
}