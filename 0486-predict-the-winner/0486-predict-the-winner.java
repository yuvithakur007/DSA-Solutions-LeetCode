class Solution {
    private boolean f(int[] nums, boolean turn, int p1, int p2, int l, int r) {
        if (l == r) {
            if (turn)
                p1 += nums[l];
            else
                p2 += nums[l];
            return p1 >= p2;
        }
        if (turn) {
            // You can win by using left OR right
            return f(nums, false, nums[l]+p1, p2, l+1, r) || f(nums, false, nums[r]+p1, p2, l, r-1);
        }
        // For you to win, opponent needs to lose using both left AND right
        return f(nums, true, p1, nums[l]+p2, l+1, r) && f(nums, true, p1, nums[r]+p2, l, r-1);
    }

    public boolean PredictTheWinner(int[] nums) {
        return f(nums, true, 0, 0, 0, nums.length-1);
    }
}