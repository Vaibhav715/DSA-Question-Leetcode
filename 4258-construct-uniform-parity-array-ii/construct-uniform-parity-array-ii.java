class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : nums1) {
            if (num % 2 != 0) {
                hasOdd = true;
            }
            if (num < min) {
                min = num;
            }
        }

        // 1. If there are no odd numbers, all elements are already even.
        // 2. If the smallest element is odd, every even number can become odd.
        return !hasOdd || (min % 2 != 0);
    }
}