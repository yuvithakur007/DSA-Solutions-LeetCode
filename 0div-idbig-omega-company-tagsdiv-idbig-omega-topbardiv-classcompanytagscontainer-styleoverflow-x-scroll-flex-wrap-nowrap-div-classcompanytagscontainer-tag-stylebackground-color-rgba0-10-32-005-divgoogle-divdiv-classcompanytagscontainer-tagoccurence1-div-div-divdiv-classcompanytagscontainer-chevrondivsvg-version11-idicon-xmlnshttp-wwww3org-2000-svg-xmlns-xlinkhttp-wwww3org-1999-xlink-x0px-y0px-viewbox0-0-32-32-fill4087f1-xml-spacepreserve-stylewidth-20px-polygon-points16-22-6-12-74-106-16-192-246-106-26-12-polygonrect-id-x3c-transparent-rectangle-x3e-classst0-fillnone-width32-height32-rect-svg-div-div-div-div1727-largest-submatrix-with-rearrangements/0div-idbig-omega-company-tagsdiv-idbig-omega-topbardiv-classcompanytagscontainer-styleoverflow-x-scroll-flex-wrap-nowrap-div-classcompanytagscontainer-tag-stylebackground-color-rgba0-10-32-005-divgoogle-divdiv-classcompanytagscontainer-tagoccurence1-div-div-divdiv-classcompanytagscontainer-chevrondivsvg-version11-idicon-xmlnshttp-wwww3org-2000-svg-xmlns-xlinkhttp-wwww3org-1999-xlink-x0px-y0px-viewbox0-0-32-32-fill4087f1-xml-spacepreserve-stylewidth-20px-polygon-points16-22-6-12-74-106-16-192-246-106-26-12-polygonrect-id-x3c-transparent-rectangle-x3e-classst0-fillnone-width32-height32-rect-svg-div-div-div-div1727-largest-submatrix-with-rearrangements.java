class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        for (int i=1; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (matrix[i][j] == 1)
                    matrix[i][j] = matrix[i-1][j] + 1;
            }
        }
        for (int i=0; i<row; i++) {
            Arrays.sort(matrix[i]);
            for (int j=1; j<=col; j++) {
                count = Math.max(count, j * matrix[i][col - j]);
            }
        }
        return count;
    }
}