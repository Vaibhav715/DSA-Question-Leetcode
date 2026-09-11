class Solution {
    public boolean isSameAfterReversals(int num) {
        // int rev = reverseNum(num);
        // rev = reverseNum(rev);
        // return (rev == num);
        return (num == 0 || num % 10 != 0);
    }

    // int reverseNum(int x) {
    //     int revNum = 0;
    //     while (x > 0) {
    //         revNum = revNum * 10 + x % 10;
    //         x /= 10;
    //     }
    //     return revNum;
    // }
}