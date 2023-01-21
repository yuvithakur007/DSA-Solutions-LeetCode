class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        if(matrix.length == 0) 
            return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int high = (n * m) - 1;  // taking as a list 1,2,3,4,5,6,7,.... and apply modulo and division for row and col number
        
        //using binary search
        while(low <= high) {
            int mid = (low + (high - low) / 2);
            if(matrix[mid/m][mid % m] == target) {  // division: mid/m for row(n) and modulo: mid%m for col(m)
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}