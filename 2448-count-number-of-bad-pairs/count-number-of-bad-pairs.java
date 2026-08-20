class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs =(long) n*(n-1)/2;
        Map<Long, Long> map = new HashMap<>();
        long goodPairs = 0; 

        for(int i = 0; i<n; i++){
            long diff = (long)(i-nums[i]);
            if(map.containsKey(diff)) {
                goodPairs += map.get(diff);
            }
            if(map.containsKey(diff)) {
                long oldFreq = map.get(diff);
                map.put(diff, oldFreq + 1);
            }else {
                map.put(diff, 1L);
            }
        }
        return totalPairs-goodPairs;
    }
}