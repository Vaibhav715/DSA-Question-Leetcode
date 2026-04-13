class Solution {
    public double myPow(double x, int n) {
        // double result = 1;
        // long pos_num =Math.abs(n);
        // for(long i = 1; i<=pos_num; i++){
        //    result = result*x;
        // }

        // if(n< 0 && x!= 0)
        //     return 1/result;
        // else
        //     return result;

        //     double result;
        //     int pos_num = Math.abs(n);
        //     if(pos_num == 1)
        //     return x;
        //     else
        //      result = x * myPow(x,pos_num-1); 

        //    if(n< 0 && x!= 0)
        //      return 1/result;
        //     else
        //      return result;

        /*
        Fast Power (Binary Exponentiation) Approach:
        
        Instead of multiplying x repeatedly n times,
        we reduce the exponent by half at every step.
        
        Key Idea:
        
        If n is even:
            x^n = (x * x)^(n / 2)
        
        If n is odd:
            x^n = x * (x * x)^((n - 1) / 2)
        
        Steps:
        1. If n is negative:
               x = 1 / x
               n = -n
        
        2. Initialize result = 1
        
        3. While n > 0:
               If n is odd:
           result = result * x
               x = x * x        // square the base
               n = n / 2        // halve the exponent
        
        Time Complexity: O(log n)
        Space Complexity: O(1)
        */

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        while (N > 0) {

            if (N % 2 == 1) {
                result *= x;
            }

            x *= x;
            N /= 2;
        }

        return result;
    }
}