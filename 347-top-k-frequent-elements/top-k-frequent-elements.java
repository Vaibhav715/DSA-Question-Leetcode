class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        } 
        int max = 0;
        int val = 0;
        for(int i = 0; i<k; i++){
            for(int key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                    val = key;
                }
            }
            arr.add(val);
            map.remove(val);
            max = 0;
        }
       
        return arr.stream().mapToInt(Integer::intValue).toArray();
            }
}