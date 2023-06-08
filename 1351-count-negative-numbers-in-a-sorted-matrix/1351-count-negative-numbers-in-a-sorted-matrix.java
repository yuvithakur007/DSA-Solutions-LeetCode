class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length, m=grid[0].length;     
        int row=n-1, column=0;             // start search from last element in first row
        int count=0;       
		
        while(row>=0 && column<m){   
            if(grid[row][column] < 0){  
                count++;            
                count += (m-1) - column;      // bcz array is sortd therefore no.s after this index are also -ve no.s. Therefore, this formula will calculate the all -ve no.s excluding the element at current index bcz it has already been included in count++;
                row--;            // as the current element is -ve therefore all elements after that is also -ve and we already counted that, so now we will search for the same in the row above the current row
            }
            else if(grid[row][column] >=0){  
                column++;     
            }
        }
        return count;     
    }
}