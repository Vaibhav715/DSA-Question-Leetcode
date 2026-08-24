
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map to store (remainder -> earliest index where it occurred)
        Map<Integer, Integer> remainderMap = new HashMap<>();
        
        // Base case: a remainder of 0 at index -1 handles subarrays starting from index 0
        remainderMap.put(0, -1);
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            int remainder = runningSum % k;
            
            // Handle negative remainders if negative numbers exist (optional for standard constraints)
            if (remainder < 0) {
                remainder += k;
            }
            
            if (remainderMap.containsKey(remainder)) {
                // Check if the subarray length is at least 2
                if (i - remainderMap.get(remainder) >= 2) {
                    return true;
                }
            } else {
                // Only store the first occurrence to maximize the subarray length
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}