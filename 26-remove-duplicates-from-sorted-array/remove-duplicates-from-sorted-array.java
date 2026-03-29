class Solution {
    public int removeDuplicates(int[] nums) {
    int different = 0;
    int same = 0;
    int temp = 0;

    if(nums.length != 0){
        different++;
        same++;
    }

    if(nums.length > 1){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1])
                different++;

            if(nums[i] == nums[i+1])
                same++;
        }
    }

    int n = nums.length;   // ✅ effective size

    if(same != nums.length){
        for(int i = 0; i < n; i++){
            if(i == 0)
                continue;

            if(nums[i] == nums[i-1]) {   // ✅ changed while → if
                temp = nums[i];

                for(int j = i; j < n - 1; j++){
                    nums[j] = nums[j+1];
                }

                nums[n - 1] = temp;

                n--;     // ✅ reduce active size
                i--;     // ✅ recheck same index
            }
        }
    }

    return different;
}
}