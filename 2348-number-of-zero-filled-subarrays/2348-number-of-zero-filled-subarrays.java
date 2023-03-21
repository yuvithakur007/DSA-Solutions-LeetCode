class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long ans=0;
    for (int i=0; i<nums.length; i++){
        long cnt=0;
        while (i<nums.length && nums[i]==0){
            cnt++;
            ans+=cnt;
            i++;
        }
    }    
    return ans;
    }
}