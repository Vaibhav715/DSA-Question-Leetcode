class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowTracker = new boolean[matrix.length];
        boolean[] colTracker = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rowTracker[i] = true;
                    colTracker[j] = true;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(rowTracker[i] == true || colTracker[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}