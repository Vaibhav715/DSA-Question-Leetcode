class Solution {
    public long countCommas(long n) {
       long result = 0;

       if (n >= 1000)
            result = result + n - 999L;

        if (n >= 1000000)
            result = result + n - 999999L;
        
        if (n >= 1000000000L)
            result = result + n - 999999999L;
        
        if (n >= 1000000000000L)
            result = result + n - 999999999999L;
        
        if (n >= 1000000000000000L)
            result = result + n - 999999999999999L;

        return result;
    }
}