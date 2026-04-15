class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0;
        int temp = x;
        if(x>=0){
            while(x > 0){
                revNum  = revNum * 10 + x%10;
                x /= 10;
            }

            if(revNum == temp)
            return true;
            else return false;
        }
        else return false;
    }
}