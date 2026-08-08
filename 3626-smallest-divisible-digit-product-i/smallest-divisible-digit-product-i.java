class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i = n; i<=100; i++){
            int dig = 1;
            int num = i;
            while(num>0){
                dig = dig * (num%10);
                num = num/10;
            }
            if(dig % t == 0){
            ans = i;
            break;
            }
            if(ans != 0) break;
        }
        return ans;
    }
}