class Solution {
    public List<Integer> majorityElement(int[] nums) {
       ArrayList<Integer> element = new ArrayList<>();
       
for(int i = 0; i < nums.length; i++){
    int majority_count = 1;

    for(int j = i+1; j < nums.length; j++){
        if(nums[j] == nums[i]){
            majority_count++;
        }
    }

if(majority_count > nums.length/3 && !element.contains(nums[i])){
        element.add(nums[i]);
    }
}

return element;
  }
}