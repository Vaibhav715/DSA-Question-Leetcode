class Solution {
    public int minRotations(String s) {
           int rotation = 0, intial = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - '0';
        if (intial == val) {
                rotation += 0;  
} else if (Math.abs(val - intial) < 10 - Math.abs(val -intial)){
                rotation = rotation + Math.abs((val - intial));   
            } else {
                rotation += 10 - Math.abs(val - intial);  
            }
            intial = val;
        }
        return rotation;
    }
}