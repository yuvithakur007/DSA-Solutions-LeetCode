class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        boolean rot1 = true, rot2 = true, rot3 = true, rot4 = true;
        int len = mat.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

                if (mat[i][j] != target[j][len - i - 1]) {
                    rot1 = false;
                }

                if (mat[i][j] != target[len - i - 1][len - j - 1]) {
                    rot2 = false;
                }

                if (mat[i][j] != target[len - j - 1][i]) {
                    rot3 = false;
                }

                if (mat[i][j] != target[i][j]) {
                    rot4 = false;
                }

            }
        }

        return rot1 || rot2 || rot3 || rot4;
    }
}