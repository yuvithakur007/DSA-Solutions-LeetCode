class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }    
    private void sort(int[] nums, int begin, int end) {
        if (begin >= end) {
            return;
        }        
        int mid = (begin + end) / 2;        
        //recursively sort from begin to mid
        sort(nums, begin, mid);
        //recursively sort from mid + 1 to end
        sort(nums, mid + 1, end);
        // merge two sections together
        int[] merged = new int[end - begin + 1];
        int left = begin;
        int right = mid + 1;        
        int counter = 0;
        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                merged[counter++] = nums[left];
                left++;
            }
            else {
                merged[counter++] = nums[right];
                right++;
            }
        }        
        if (left > mid) {
            for (int i = right; i <= end; i++) {
                merged[counter++] = nums[i];
            }
        }        
        if (right > end) {
            for (int i = left; i <= mid; i++) {
                merged[counter++] = nums[i];
            }
        }
        // copy merged back to original array
        counter = 0;
        for (int i = begin; i <= end; i++) {
            nums[i] = merged[counter++];
        }
    }
}