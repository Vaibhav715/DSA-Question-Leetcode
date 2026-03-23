class Solution {
    public int maxArea(int[] height) {
        int Max_Area = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
            int leng = Math.min(height[leftPointer], height[rightPointer]);
            int width = rightPointer - leftPointer;
            int curr_Area = leng * width;
            Max_Area = Math.max(Max_Area, curr_Area);
            if (height[leftPointer] < height[rightPointer])
                leftPointer++;
            else
                rightPointer--;
        }
        return Max_Area;
    }
}