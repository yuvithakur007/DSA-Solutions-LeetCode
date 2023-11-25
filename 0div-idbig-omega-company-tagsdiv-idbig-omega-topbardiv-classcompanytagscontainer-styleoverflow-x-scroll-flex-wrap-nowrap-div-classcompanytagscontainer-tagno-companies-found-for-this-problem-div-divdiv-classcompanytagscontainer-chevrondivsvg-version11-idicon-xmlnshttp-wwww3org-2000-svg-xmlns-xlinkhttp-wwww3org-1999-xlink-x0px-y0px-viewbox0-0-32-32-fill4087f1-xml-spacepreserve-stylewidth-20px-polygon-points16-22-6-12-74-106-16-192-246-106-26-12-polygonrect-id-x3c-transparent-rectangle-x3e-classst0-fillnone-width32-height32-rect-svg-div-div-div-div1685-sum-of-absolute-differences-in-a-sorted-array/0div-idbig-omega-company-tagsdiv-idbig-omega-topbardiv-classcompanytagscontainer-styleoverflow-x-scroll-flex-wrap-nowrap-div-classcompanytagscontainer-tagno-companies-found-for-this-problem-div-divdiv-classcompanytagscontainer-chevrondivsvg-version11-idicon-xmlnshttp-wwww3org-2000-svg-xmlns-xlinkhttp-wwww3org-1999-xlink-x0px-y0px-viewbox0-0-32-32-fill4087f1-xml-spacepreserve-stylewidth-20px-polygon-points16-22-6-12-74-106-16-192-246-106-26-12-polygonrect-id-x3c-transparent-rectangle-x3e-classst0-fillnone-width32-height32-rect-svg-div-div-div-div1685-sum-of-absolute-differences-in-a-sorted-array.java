class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len=nums.length;
        int sum=0;
        int []arr=new int [len];
        for (int i:nums){sum+=i;}
        int backsum=0;
        for (int i=0;i<len;i++)
        {
            backsum+=nums[i];
            sum-=nums[i];
            int l=len-i-1;
            arr[i]=sum-nums[i]*l+nums[i]*(len-l)-backsum;
        }
        return arr;
    }
}
