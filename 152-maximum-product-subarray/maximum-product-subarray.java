class Solution {
    public int maxProduct(int[] nums) {
        int curr_product = 1;
        int index_product = nums[0];
        int max_product = nums[0];
        int product = 1;
        for(int i = 0; i < nums.length; i++){ 
            for(int j = i;j < nums.length; j++){
          product = product * nums[j];
          curr_product = Math.max(product,nums[j]*curr_product);
          index_product = Math.max(nums[j],curr_product);
          max_product = Math.max(max_product,index_product);
        }
          curr_product = 1;
          product = 1;
        }
        return max_product;
    }
}