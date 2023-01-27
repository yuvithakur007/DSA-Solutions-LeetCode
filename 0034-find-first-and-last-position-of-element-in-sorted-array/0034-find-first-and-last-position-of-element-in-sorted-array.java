// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int l = 0;
//         int r = nums.length-1;
//         while(l <= r){
//             int mid = (l+r)/2;            
//             if(nums[mid] == target){
//                 if(nums[l] == target && nums[r] == target){
//                     return new int[]{l,r};
//                 }
//                 if(nums[l] < target){
//                     l++;
//                 }
//                 if(nums[r] > target){
//                     r--;
//                 }
//             } else if(target < nums[mid]){
//                 r = mid-1;
//             } else {
//                 l = mid+1;
//             }
//         }
//         return new int[]{-1,-1};   
//     }
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstOccurrence(nums, target);
        arr[1] = lastOccurrence(nums, target);
        
        return arr;
    }
    
    //first occurrence
    public int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                end = mid-1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
    
    //last occurrence
    public int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}