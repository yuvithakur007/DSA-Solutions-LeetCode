class Solution {
    
        public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
		
        return max;
    }
    
//         public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i< nums.length; i++) {
//             int currSum = 0;

//             for (int j = i; j < nums.length; j++) {
//                 currSum += nums[j];
//                 maxSum = Math.max(currSum, maxSum);
//             }
//         }

//         return maxSum;
//     }
    
   // public int maxSubArray(int[] nums) {
   //      // base case
   //      if (nums == null || nums.length == 0) {
   //          return Integer.MIN_VALUE;
   //      }
   //      // Instantiate the basic situation
   //      // the pointer of largest sum including current index
   //      int sum = nums[0]; 
   //      int max = nums[0];
   //      // Linear Scan
   //      for (int i = 1; i < nums.length; i++) {
   //          // Looking back
   //          if (sum < 0) {
   //              sum = nums[i];
   //          } else {
   //              sum += nums[i];
   //          }
   //          // Updating the global max
   //          max = Math.max(max, sum);
   //      }
   //      return max;
   //  }
}