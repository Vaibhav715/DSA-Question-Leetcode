class Solution {
    public int singleNumber(int[] nums) {
        // if(nums == null || nums.length == 0) return 0;
    
        // int n = nums.length;
        // int arr[] = new int[n * 2];
        // for (int i = 0; i < n; i++) {
        //     arr[i * 2] = nums[i];
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(nums[i]==arr[j*2] && i!=j){
        //             arr[(j * 2)+1]++;
        //         }
        //     }
        // }
        // int i=0;
        // for(i=0;i<n;i++){
        //     if(arr[(i*2)+1]==0)
        //     break;
        // }
        // return nums[i];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i]))
             map.put(nums[i],map.get(nums[i])+1);
            else
            map.put(nums[i], 1);
        }

        for(int x : map.keySet()){
            if(map.get(x) == 1) return x;
        }
        return 0;
    }
}