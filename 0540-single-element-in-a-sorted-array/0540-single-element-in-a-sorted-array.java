class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Intution: keep dividing your array in two halves and check in which half there are odd number of elements...that will be your required part.
        if(nums.length==1) return nums[0];
        int l = 0;
        int h = nums.length-1;
        while(l<h){
            int mid = l+(h-l)/2; 
            if(nums[mid]==nums[mid+1]) mid = mid-1;
            if((mid-l+1)%2!=0) h = mid;            // checking the length of left half. If its is odd then update ur right pointer to mid
            else l = mid+1;    // else your right half will be odd then update your left pointer to mid+1
        }
        return nums[l];     //left pointer will have the answer at last
    } 
    // usingh xor
    //         int n = nums.length;
    //         int elem = 0;
    //         for (int i = 0; i < n; i++) {
    //             elem = elem ^ nums[i];
    //     }
    //     return elem;
    // }
}