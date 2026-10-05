class Solution {
    public double minimumAverage(int[] nums) {
        double min =50;
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length -1;

        while(start<end){
            min = Math.min((nums[start]+nums[end])/ 2.0, min);
            start++;
            end--;
        }
        return min;
    }
}