class Solution {
    public boolean canJump(int[] nums) {
      int max=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1) return true;
            if(max==0 && nums[i]==0) return false;
            if(nums[i]>max)max= nums[i];
            max--;
        }
        return false;
    }
}

// class Solution {
//     public boolean canJump(int[] nums) {
//         int goal = nums.length-1;
//         for(int i=nums.length-2; i>=0; i--){
//             // Goal post keeps moving backwards
//             if(i+nums[i]>=goal) goal = i;
//         }
//         // At the end we will check if goal post moved all the way back to 0 if yes path exists otherwise it doesn't.
//         return goal == 0? true: false;
//     }
// }

