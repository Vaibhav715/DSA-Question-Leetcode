class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int i = 0;
        int result[] = new int[seq.length()];
        while (i < seq.length()) {
            result[i] = (i^seq.charAt(i)) & 1;
            i++;
        }
        return result;
    }
}