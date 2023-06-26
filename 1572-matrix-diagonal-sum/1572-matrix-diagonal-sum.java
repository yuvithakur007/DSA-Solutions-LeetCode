class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += mat[i][i];
            if(i!= n-i-1)
                result+=mat[i][n - i - 1];
        }
        // if (n % 2 == 1) {
        //     result -= mat[n / 2][n / 2];
        // }
        return result;
    }
}