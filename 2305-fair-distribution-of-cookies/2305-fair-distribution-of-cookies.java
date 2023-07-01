class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        helper(cookies, 0, k, new int[k], ans);
        return ans[0];
    }

    private void helper(int[] cookies, int start, int k , int[] arr, int[] ans){
        if(start == cookies.length){
            int max = 0;
            for(int n : arr){
                max = Math.max(n, max);
            }
            ans[0] = Math.min(ans[0], max);
            return;
        }
        for(int i = 0 ; i < k ; i++){
            arr[i] += cookies[start];
            helper(cookies, start+1, k, arr, ans);
            arr[i] -= cookies[start];
        }
    }
}
//DC