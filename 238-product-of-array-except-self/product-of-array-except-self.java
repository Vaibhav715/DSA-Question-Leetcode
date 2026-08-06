class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int len = nums.length;
        // int[] product = new int[len];
        // int res = 1, f = -1;
        // for (int i = 0; i < len; i++) {
        //     if(nums[i] == 0){
        //     f = 1;
        //     continue;
        //     }
        //  res = res * nums[i];
        // }

        // for(int i = 0; i < len; i++){

        //     if(f == 1){
        //         int j = 0;
        //         while(j < len){
        //             if(nums[j] != 0)
        //             product[j] = 0;
        //             else if(nums[j] == 0){
        //             product[j] = res;
        //             break;
        //             }
        //             j++;
        //         }
               
        //     }
        //     if(f != 1 && nums[i] != 0)
        //     product[i] = res/nums[i];
        // }

        // return product;


        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixProduct[i] = prefixProduct[i-1] * nums[i];
        }
        
        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2; i >=0; i--){
            suffixProduct[i] = suffixProduct[i+1] * nums[i];
        }

        int[] productArray = new int[nums.length];
        productArray[0] = suffixProduct[1];
        productArray[nums.length-1] = prefixProduct[nums.length-2];

        for(int i = 1; i < nums.length-1;i++){
            productArray[i] = prefixProduct[i-1] * suffixProduct[i+1];
        }
        return productArray;

    }
}