// class Solution {
//     public long countCommas(long n) {
//        long result = 0;

//        if (n >= 1000)
//             result = result + n - 999L;

//         if (n >= 1000000)
//             result = result + n - 999999L;
        
//         if (n >= 1000000000L)
//             result = result + n - 999999999L;
        
//         if (n >= 1000000000000L)
//             result = result + n - 999999999999L;
        
//         if (n >= 1000000000000000L)
//             result = result + n - 999999999999999L;

//         return result;
//     }
// }


class Solution {
    // Thresholds: 10^3, 10^6, 10^9, 10^12, 10^15, 10^18
    private static final long[] THRESHOLDS = {
        1_000L,
        1_000_000L,
        1_000_000_000L,
        1_000_000_000_000L,
        1_000_000_000_000_000L,
        1_000_000_000_000_000_000L
    };

    public long countCommas(long n) {
        long total = 0;
        for (long t : THRESHOLDS) {
            if (n >= t) {
                total += (n - t + 1);
            } else {
                break;
            }
        }
        return total;
    }
}