class Solution {
    //binary search O(logn)
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < nums[mid]) {
                hi = mid - 1;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return lo;
    }
}
// linera O(n)
//     public int searchInsert(int[] nums, int target) {
//         int n= nums.length;
//         for(int i=0; i<n; i++){
//             if(nums[i]==target || target<nums[i]){
//                 return i;
//             }
//         }
//         return n;
//     }
// }