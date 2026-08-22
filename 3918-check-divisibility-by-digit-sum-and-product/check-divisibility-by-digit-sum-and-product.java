class Solution {
    public boolean checkDivisibility(int n) {
        int sum = digitsum(n);
        int product = digitprod(n);

        int total = sum + product;
        if (total == 0) return false; // Prevent potential division by zero

        return n % total == 0;
    }

    private int digitsum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += (x % 10);
            x /= 10;
        }
        return sum;
    }

    private int digitprod(int x) {
        if (x == 0) return 0;
        int prod = 1;
        while (x > 0) {
            prod *= (x % 10); // Parentheses ensure proper digit extraction
            x /= 10;
        }
        return prod;
    }
}
