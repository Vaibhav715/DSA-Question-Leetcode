class Solution {
    public int scoreOfString(String s) {
        int val = s.charAt(0) - '0'; 
        int temp = 0;
        int result = 0;
        for(int i = 1; i<s.length(); i++){
            temp = s.charAt(i) - '0';
            result += Math.abs(val - temp);
            val = temp;    
        }
        return result;
    }
}