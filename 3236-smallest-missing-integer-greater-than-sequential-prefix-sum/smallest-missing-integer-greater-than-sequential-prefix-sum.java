class Solution {
    public int missingInteger(int[] nums) {
        if (nums.length == 1)
            return nums[0] + 1;
        int sum = nums[0], a = 0, t = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                t = 1;
                a = i - 1;
                break;
            }
        }

        if (a == 0 && t == 0)
            a = nums.length - 1;

        for (int j = 1; j <= a; j++) {
            sum += nums[j];
        }

        boolean found = true;
        while (found) {
            found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == sum) {
                    sum++; // Increment by 1
                    found = true; // Mark as found to trigger another check
                    break; // Restart the search for the new sum
                }
            }
        }

        return sum;
    }
}