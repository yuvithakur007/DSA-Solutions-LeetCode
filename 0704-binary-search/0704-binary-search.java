class Solution {
// iteration
		public int search(int[] nums, int target) {
		int low =0,high=nums.length-1;
		while(low<=high){
		int mid=(low + (high-low)/2);
		if(nums[mid]==target)return mid;
		if(nums[mid]>target)high=mid-1;
		if(nums[mid]<target)low=mid+1;
		}
		return -1;
		}
// using binary with recursion
//     public int search(int[] nums, int target) {
//         return binarySearch(nums, 0, nums.length-1, target);
//     }
//     public int binarySearch(int[] nums, int start, int end, int target){
//         if(start <= end){
//             int mid = start + (end - start)/2;
//             if(nums[mid] == target){
//                 return mid;
//             }if(nums[mid] < target){
//                 return binarySearch(nums, mid+1, end, target);
//             }
//             return binarySearch(nums, start, mid-1, target);
//         }
        
//         return -1;
//     }
}