class Solution {
    public void sortColors(int[] nums) {

//         int zeroes = 0;
//         int ones = 0;
//         int twos = 0;

//         for(int i = 0 ; i<nums.length;i++){
//             if(nums[i] == 0)
//             zeroes++;
//             if(nums[i] == 1)
//             ones++;
//             if(nums[i] == 2)
//             twos++;

//         }

//    for(int i = 0;i<zeroes;i++){
//     nums[i] = 0;
//    }
//    for(int i = zeroes;i<ones+zeroes;i++){
//     nums[i] = 1;
//    }
//    for(int i = ones+zeroes;i<zeroes+ones+twos;i++){
//     nums[i] = 2;
//    }

   int p1 = -1, p2 = nums.length, idx = 0;
   while(idx < p2){
    if(nums[idx] == 1){
        idx++;
    }
    else if(nums[idx] == 0){
        p1++;
        swap(nums, idx, p1);
        idx++;
    }
    else{
        p2--;
        swap(nums, idx, p2);
    }
   }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}