class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = n + 1;
        int left = 0; 
        int sum = 0;    
        for (int right = 0; right < n; right++) {
            sum += nums[right];      
            while (sum >= target) {
                int currentLength = right - left + 1; 
                minLength = Math.min(minLength, currentLength); 
                sum -= nums[left]; 
                left++; 
            }
        }  
        return (minLength != n + 1) ? minLength : 0;
    }
}