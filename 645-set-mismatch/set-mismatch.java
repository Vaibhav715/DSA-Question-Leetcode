class Solution {
    public int[] findErrorNums(int[] nums) {
       int arr[] = new int[2];
HashMap<Integer, Integer> map = new HashMap<>();

// Count frequency
for(int i = 0; i < nums.length; i++){
    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
}

// Find duplicate and missing
for(int i = 1; i <= nums.length; i++){
    int count = map.getOrDefault(i, 0);

    if(count == 2){
        arr[0] = i;   // duplicate
    }

    if(count == 0){
        arr[1] = i;   // missing
    }
}

return arr;
    }
}