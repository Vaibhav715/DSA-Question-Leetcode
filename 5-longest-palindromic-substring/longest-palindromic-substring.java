class Solution {
    public String longestPalindrome(String s) {
        boolean[][] palindromeTracker = new boolean[s.length()][s.length()];
        int si = -1, ei = -1, n = s.length(), maxLength = 0;
        for(int gap = 0; gap < n; gap++) {
            for(int i = 0, j = gap; i < n && j < n; i++, j++) {
                if(i == j) {
                    palindromeTracker[i][j] = true;
                }else if(i + 1 == j) {
                    if(s.charAt(i) == s.charAt(j)) {
                        palindromeTracker[i][j] = true;
                    }
                }else {
                    if(s.charAt(i) == s.charAt(j) && palindromeTracker[i + 1][j - 1] == true) {
                        palindromeTracker[i][j] = true;
                    }
                }
                if(palindromeTracker[i][j] == true) {
                    if(j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        si = i;
                        ei = j;
                    }
                }
            }
        }
        return si == -1 ? "" : s.substring(si, ei + 1);
    }
}