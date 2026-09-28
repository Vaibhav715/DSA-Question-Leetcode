class Solution {
    public int maxDepth(String s) {
        int Obrac = 0, maxOP = 0, i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                Obrac++;
                maxOP = Math.max(maxOP, Obrac);
            }

            else if (s.charAt(i) == ')') {
                Obrac--;
            }

            i++;
        }
        return maxOP;
    }
}