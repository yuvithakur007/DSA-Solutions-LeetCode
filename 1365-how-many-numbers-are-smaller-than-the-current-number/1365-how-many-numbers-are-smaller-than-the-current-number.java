class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums){
        int res[]= new int[nums.length];
        int temp[]= new int[101];
        // frequency stored
        for(int i=0; i<nums.length; i++){
            temp[nums[i]]++;
        }
        // running sum
        for(int i=1; i<101; i++){
            temp[i]= temp[i]+temp[i-1];
        }
        // storing ans
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
                res[i]= temp[nums[i]-1];
            }
        }
        return res;
    }    
    // public int[] smallerNumbersThanCurrent(int[] nums){
    //     int result[]= new int[nums.length];
    //     for(int i=0; i<nums.length; i++){
    //         int count=0;
    //         for(int j=0; j<nums.length; j++){
    //             if(nums[i]>nums[j] && j!=i) 
    //                 count++;
    //         }
    //         result[i]=count;
    //     }
    //     return result;
    // }
}