class Solution {
    public int rob(int[] nums) {
      if(nums.length==0)
			 return 0;
		 int [] arr2= new int [nums.length+1];
		 arr2[0]=0;
		 arr2[1]=nums[0];
		 for(int i=1;i<nums.length;i++) {
			 arr2[i+1]=Math.max(arr2[i], arr2[i-1]+nums[i]);
		 }
		 return arr2[nums.length];
    }
}