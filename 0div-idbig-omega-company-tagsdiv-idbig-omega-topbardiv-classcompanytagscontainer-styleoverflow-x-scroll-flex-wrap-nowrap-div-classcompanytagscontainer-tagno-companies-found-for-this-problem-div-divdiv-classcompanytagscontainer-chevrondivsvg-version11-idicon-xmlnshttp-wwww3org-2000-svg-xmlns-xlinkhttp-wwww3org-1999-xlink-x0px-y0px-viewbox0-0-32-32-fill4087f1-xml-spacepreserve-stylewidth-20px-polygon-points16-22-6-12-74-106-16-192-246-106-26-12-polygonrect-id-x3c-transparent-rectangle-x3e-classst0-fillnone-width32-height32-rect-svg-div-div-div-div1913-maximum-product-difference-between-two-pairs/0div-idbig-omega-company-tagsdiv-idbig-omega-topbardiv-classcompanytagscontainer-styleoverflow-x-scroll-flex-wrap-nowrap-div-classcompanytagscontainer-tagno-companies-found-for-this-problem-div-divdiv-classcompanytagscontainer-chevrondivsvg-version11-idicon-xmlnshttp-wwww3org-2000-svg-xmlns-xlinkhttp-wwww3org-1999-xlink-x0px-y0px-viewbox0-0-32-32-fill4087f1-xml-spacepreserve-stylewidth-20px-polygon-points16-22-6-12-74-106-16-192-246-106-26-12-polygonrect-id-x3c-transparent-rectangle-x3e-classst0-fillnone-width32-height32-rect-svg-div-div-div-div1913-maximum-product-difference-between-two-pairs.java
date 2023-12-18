class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int val : nums){
            if(val > max1){
                max2 = max1;
                max1 = val;
            } else if(val > max2){
                max2 = val;
            }
            
            if(val < min1){
                min2 = min1;
                min1 = val;
            } else if(val < min2){
                min2 = val;
            }
        }
        
        return (max1 * max2) - (min1 * min2);
    }
}