class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(sumOfDigits(nums[i]) == i)
            return i;
        }
        return -1;
    }

    int sumOfDigits(int x){
        int sum = 0;
        while(x>0){
            sum = sum  + (x % 10);
            x /= 10;
        }
        return sum;
    }
}