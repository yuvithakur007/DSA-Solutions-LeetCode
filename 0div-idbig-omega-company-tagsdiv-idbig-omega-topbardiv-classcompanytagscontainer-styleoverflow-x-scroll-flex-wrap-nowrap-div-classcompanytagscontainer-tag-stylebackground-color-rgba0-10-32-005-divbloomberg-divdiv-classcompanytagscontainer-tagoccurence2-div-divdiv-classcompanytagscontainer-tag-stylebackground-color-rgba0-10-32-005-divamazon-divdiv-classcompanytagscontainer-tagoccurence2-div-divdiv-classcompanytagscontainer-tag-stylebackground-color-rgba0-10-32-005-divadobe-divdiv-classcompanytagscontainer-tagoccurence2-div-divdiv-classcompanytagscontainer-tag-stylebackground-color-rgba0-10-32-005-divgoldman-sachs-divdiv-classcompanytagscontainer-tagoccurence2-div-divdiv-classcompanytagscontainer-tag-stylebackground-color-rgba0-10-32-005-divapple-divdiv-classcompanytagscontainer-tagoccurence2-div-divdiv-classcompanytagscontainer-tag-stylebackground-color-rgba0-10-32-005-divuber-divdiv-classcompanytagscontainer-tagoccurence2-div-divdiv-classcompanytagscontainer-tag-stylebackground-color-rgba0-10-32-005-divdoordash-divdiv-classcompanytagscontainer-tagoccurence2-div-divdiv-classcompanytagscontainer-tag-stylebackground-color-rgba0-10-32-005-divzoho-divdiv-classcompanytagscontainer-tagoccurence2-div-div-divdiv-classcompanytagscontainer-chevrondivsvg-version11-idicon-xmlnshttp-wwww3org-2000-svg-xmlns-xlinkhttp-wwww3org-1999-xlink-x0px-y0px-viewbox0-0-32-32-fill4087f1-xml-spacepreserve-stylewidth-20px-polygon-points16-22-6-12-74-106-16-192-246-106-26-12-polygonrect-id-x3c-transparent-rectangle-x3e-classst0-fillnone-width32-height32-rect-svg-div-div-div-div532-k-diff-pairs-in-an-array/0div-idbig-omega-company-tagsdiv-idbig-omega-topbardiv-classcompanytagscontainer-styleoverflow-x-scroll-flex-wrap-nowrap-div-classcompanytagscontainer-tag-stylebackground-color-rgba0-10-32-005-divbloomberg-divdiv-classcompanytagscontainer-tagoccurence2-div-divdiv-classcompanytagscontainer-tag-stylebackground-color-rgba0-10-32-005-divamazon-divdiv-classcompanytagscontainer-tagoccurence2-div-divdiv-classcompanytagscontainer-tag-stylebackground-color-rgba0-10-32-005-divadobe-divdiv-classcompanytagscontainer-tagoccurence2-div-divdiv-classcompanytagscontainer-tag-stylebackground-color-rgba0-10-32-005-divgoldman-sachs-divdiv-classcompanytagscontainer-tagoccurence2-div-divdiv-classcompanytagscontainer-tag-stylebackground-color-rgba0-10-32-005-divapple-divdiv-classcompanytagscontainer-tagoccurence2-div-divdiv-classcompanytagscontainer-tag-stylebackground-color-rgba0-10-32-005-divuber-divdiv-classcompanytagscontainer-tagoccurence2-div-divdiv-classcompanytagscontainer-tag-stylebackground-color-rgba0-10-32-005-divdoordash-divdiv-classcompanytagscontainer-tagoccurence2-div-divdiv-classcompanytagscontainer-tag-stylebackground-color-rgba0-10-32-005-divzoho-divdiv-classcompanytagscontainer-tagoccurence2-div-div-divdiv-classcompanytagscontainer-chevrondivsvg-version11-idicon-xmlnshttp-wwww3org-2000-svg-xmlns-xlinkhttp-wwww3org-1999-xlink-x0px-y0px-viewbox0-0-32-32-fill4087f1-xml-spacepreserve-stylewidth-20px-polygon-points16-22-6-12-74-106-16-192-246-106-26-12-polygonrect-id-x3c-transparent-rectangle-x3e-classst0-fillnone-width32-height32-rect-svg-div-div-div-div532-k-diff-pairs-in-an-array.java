class Solution {
    public int findPairs(int[] nums, int k) {
        int i=0;
        int j=1;
        int m=0;
        int abs=0;
        Arrays.sort(nums);
        int sum=Integer.MIN_VALUE;
        while(i<nums.length-1 && j<nums.length){
            if( Math.abs(nums[i]-nums[j])==k && (nums[i]+nums[j])!=sum){
                  
                     sum=nums[i]+nums[j];
                       m++;  
                    i++; j++;      
            }
            else if((nums[j]-nums[i])<k){
                j++;
            }
			else{
                i++;
            }
            if(i==j) j++;
            }
        return m;
    }
}