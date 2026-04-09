class Solution {
    public int reverse(int x) {
        int rev = 0;
        int temp = x;

        if (temp == 0)
            return rev;

        if (temp > 0) {

            while (temp > 0) {

                // overflow check
                if (rev > Integer.MAX_VALUE / 10)
                    return 0;

                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

        } else {

            temp = Math.abs(temp);

            while (temp > 0) {

                // overflow check
                if (rev > Integer.MAX_VALUE / 10)
                    return 0;

                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            rev = -rev;
        }

        return rev;
    }
}