// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int result[] = new int[2], count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target && count == 0) {
//                 result[0] = i;
//                 count++;
//             }
//             if (nums[i] == target) {
//                 result[1] = i;
//             }
//         }
//         if (count == 0) {
//             result[0] = -1;
//             result[1] = -1;
//             return result;
//         }
//         return result;

//     }
// }


//  Binary Search 

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1; // search left
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1; // search right
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}