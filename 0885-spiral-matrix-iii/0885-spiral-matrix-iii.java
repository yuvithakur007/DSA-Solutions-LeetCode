class Solution {    
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int matrixSize = rows * cols;
        int[][] ans = new int[matrixSize][2];
        int visited = 0;
        int rowStart = rStart;
        int rowEnd = rowStart + 1;
        int colStart = cStart;
        int colEnd = colStart + 1;
        while(visited < matrixSize) {
            // left to right
            for(int col = colStart; col <= colEnd && visited < matrixSize; col++) {
                visited = addVisitedPosition(ans, visited, rows, cols, rowStart, col);
            }
            // up to down
            for(int row = rowStart + 1; row <= rowEnd && visited < matrixSize; row++) {
                visited = addVisitedPosition(ans, visited, rows, cols, row, colEnd);
            }
            // right to left
            for(int col = colEnd - 1; col >= colStart - 1 && visited < matrixSize; col--) {
                visited = addVisitedPosition(ans, visited, rows, cols, rowEnd, col);
            }
            // down to up
            for(int row = rowEnd - 1; row >= rowStart && visited < matrixSize; row--) {
                visited = addVisitedPosition(ans, visited, rows, cols, row, colStart - 1);
            }
            rowStart--;
            rowEnd++;
            colStart--;
            colEnd++;
        }    
        return ans;        
    }
    
    private int addVisitedPosition(int[][] ans, int visited, int m, int n, int row, int col) {
        if(row >= 0 && row < m && col >= 0 && col < n) {
            ans[visited] = new int[]{row, col};
            return visited + 1;
        }
        return visited;
    }
}