class Solution {
    static int MOD = 1000000007;
    
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap();
        int pairCount = 0;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int key = num - reverse(num);
            int prevCount  = map.getOrDefault(key, 0);
            pairCount += prevCount;
            pairCount %= MOD;
            map.put(key, prevCount + 1);
        }
        return pairCount;
    }
    private int reverse(int num){
        int reverseNum = 0;
        while(num > 0){
            reverseNum = (reverseNum * 10) + (num % 10);
            num /= 10;
        }
        return reverseNum;
    }
}