class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n/2; i++) {
            result[i] = i + 1;
            result[n-i - 1] = -(i + 1);
        }
        return result;
        
        // int[] res = new int[n];
        // for (int i = 0; i < n; i++)
        //     res[i] = i * 2 - n + 1;
        // return res; 
    }
}