import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, num = x;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == x)
            return true;
        else
            return false;
    }

   /* public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution palin = new Solution();
        palin.isPalindrome(n);
    }*/
}