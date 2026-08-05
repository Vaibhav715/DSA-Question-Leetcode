// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int concate[] = new int[2*nums.length];
//         int idx = 0;
//         for(int i = 0; i<nums.length; i++){
//             concate[i] = nums[i];
//             concate[i + nums.length] = nums[i];
            
//         }
//        return concate;
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {

        int ans[] = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }
}