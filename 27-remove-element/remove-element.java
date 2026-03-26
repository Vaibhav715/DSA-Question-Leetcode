class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length-1;
        int count = 0;
        int temp = 0;

         if(start == end && nums[start] == val)
              return 0;
         if(start == end && nums[start] != val) 
              return 1;

        while(start <= end){
            if(nums[start] == val && nums[start] == nums[end])
              end--;
             else if(nums[start] != val && nums[start] == nums[end]){
              count++;
              start++;
             }
             else if(nums[start] != val && nums[start] != nums[end]){
                count++;
                start++;
             }
              else if(nums[end] != val && start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            count++;
           }
           else if(nums[end] == val) 
           end--;
           
    }
   
    return count;
 }
}