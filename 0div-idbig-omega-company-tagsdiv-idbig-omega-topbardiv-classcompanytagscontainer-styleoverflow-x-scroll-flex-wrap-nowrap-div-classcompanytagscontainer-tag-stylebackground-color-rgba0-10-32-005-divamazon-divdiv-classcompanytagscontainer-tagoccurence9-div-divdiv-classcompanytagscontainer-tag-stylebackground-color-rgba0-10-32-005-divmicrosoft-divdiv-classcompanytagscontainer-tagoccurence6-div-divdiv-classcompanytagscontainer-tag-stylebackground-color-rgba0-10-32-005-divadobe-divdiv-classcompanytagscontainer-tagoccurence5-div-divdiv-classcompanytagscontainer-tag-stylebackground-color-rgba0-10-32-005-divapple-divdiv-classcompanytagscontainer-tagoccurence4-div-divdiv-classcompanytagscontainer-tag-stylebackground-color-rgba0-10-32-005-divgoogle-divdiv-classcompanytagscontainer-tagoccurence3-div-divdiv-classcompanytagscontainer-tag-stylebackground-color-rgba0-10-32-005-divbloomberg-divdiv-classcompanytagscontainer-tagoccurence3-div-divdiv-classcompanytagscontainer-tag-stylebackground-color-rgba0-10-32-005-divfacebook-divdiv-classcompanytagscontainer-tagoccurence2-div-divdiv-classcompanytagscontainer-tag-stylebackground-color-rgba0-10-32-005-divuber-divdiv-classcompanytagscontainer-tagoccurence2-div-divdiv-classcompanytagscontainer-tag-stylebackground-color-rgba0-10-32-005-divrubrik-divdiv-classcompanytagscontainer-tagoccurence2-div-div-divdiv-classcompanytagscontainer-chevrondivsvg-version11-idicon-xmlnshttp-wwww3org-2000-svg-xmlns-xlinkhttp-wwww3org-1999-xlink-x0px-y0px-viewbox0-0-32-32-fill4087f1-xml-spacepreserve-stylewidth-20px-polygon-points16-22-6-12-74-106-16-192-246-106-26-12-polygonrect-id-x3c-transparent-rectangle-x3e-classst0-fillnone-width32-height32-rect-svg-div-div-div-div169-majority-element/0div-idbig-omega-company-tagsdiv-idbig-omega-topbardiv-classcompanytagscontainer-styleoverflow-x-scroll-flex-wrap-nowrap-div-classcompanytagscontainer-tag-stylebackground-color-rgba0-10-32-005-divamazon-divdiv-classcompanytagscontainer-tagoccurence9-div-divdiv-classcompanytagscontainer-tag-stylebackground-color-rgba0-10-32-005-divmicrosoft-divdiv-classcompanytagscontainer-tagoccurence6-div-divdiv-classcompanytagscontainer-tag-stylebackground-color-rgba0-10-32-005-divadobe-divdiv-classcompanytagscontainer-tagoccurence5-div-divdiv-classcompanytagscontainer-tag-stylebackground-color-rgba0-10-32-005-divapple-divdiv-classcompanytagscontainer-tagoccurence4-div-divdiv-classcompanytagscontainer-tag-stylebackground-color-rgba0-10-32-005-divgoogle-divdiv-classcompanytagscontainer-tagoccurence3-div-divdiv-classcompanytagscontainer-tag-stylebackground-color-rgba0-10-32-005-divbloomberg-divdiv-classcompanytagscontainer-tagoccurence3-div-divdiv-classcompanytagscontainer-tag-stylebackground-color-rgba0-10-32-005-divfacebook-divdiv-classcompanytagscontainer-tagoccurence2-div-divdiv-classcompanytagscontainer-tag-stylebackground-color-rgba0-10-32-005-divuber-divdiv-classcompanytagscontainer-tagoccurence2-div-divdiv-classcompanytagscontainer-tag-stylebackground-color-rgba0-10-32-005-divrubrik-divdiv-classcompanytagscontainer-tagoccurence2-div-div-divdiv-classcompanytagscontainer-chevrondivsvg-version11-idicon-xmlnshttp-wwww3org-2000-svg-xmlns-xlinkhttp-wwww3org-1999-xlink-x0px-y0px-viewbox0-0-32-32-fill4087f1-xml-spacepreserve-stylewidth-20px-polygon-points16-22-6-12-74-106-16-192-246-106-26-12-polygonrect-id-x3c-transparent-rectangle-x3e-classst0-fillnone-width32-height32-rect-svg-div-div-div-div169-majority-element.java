class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length-1)/2;
        return nums[mid];
    }
}