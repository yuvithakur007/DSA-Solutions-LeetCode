class Solution {
    public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            int elem = 0;
            for (int i = 0; i < n; i++) {
                elem = elem ^ nums[i];
        }
        return elem;
    }
}