class Solution {
    public int findDuplicate(int[] nums) {
     boolean[] visited = new boolean[nums.length];
        for (int num : nums){
            if (visited[num])
                return num;
            visited[num] = true;
        }

        return 1;
    }
    //   int n = nums.length;
    //     Arrays.sort(nums);
    //     for (int i = 0; i < n - 1; i++) {
    //         if (nums[i] == nums[i + 1]) {
    //             return nums[i];
    //         }
    //     }
    //     return 0;
    // }
}