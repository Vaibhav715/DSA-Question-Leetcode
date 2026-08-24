class Solution {
    public int numOfWays(int n) {
    long mod = 1_000_000_007;
    long same = 6; // ABA pattern (2 colors: 3 * 2 = 6)
    long diff = 6; // ABC pattern (3 colors: 3 * 2 * 1 = 6)

    for (int i = 2; i <= n; i++) {
        // An ABA row generates 3 ABA and 2 ABC rows
        // An ABC row generates 2 ABA and 2 ABC rows
        long newSame = (3 * same + 2 * diff) % mod;
        long newDiff = (2 * same + 2 * diff) % mod;

        same = newSame;
        diff = newDiff;
    }

    return (int) ((same + diff) % mod);
}
}