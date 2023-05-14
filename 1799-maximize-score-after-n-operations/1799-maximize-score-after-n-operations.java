class Solution {

    private int[] memo;

    public int maxScore(int[] nums) {
        // there are 2 ^ nums.length possible memo states
        int memoSize = 1 << nums.length;
        memo = new int[memoSize];
        Arrays.fill(memo, -1);

        return backTrack(0, 0, nums);
    }

    private int backTrack(int pairCount, int mask, int[] nums) {
        // check if all nums are selected
        if(2 * pairCount == nums.length) return 0;
        pairCount += 1;

        if(memo[mask] >= 0) return memo[mask];

        int max = 0;
        for(int first = 0; first < nums.length - 1; first++) {
            for(int second = first + 1; second < nums.length; second++) {

                // check if any of the numbers is already picked
                if(((mask >> first) & 1)== 1 || ((mask >> second) & 1) == 1) continue;

                int newMask = mask | (1 << first) | (1 << second);
                int current = pairCount * gcd(nums[first], nums[second]);
                int rest = backTrack(pairCount, newMask, nums);
                max = Math.max(max, current + rest);
            }
        }

        memo[mask] = max;
        return max;
    }

    private int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}

// class Solution {
//     public int maxScore(int[] nums) {
//         int n= nums.length;
//         int ans=0;
//         int k=0;
//         int x=1;
//         for(int i=0; i<n/2; i++){
//             int a=nums[k];
//             int b=nums[k+1];
//             ans =ans+ x * gcd(a, b);
//             k=k+2;
//             x++;
//         }
//         return ans;
//     }
//     private int gcd(int a, int b){
//         if (b == 0)
//             return a;
//         else
//             return gcd(b, a % b);
//     }
// }