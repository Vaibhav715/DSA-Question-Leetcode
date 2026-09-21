class Solution {
    public int reverseDegree(String s) {
        int value = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
             //value = value + (( 26 - (ch - 'a'))*(i+1));
             value = value + (( 26 - (ch - 'a'))*(i+1));
        }
        return value;
    }
}