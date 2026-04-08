class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int flag = -1;
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > 1)
            flag = 1;
        }

        return (flag != -1) ? true : false;
    }
}