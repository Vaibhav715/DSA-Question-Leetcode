class Solution {
    public boolean checkDivisibility(int n) {
        int sum = digitsum(n);
        int product = digitprod(n);

        return n % (sum + product) == 0 ? true : false;
    }

    int digitsum(int x){
        if(x == 0) return 0;
        int sum = 0;
        while(x>0){
            sum = sum + x%10;
            x /= 10;
        }
        return sum;
    }

    int digitprod(int x){
        if(x == 0) return 0;
        int prod = 1;
         while(x>0){
            prod = (prod * (x%10));
            x /= 10;
        }
        return prod;
    }
}