class Solution {
    public int[] runningSum(int[] nums) 
    {
        for(int i = 1; i < nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        return nums;
    }    
    // public int[] runningSum(int[] nums) 
    // {
    //     int runningSum[]= new int[nums.length];
    //     int sum=0;
    //     for(int i=0; i<nums.length; i++)
    //     {
    //         sum=sum+nums[i];
    //         runningSum[i]=sum;
    //     }
    //     return runningSum;
    // }
}