class Solution {
    public int knightDialer(int n) {
        if(n == 1)
            return 10;
        int[] og = new int[10];
        int mod = 1000000007;
        Arrays.fill(og, 1);
        int[][] reach = {{4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9}, {}, {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}};
        for(int i = 2; i <= n; i++){
            int[] newarr = new int[10];
            int sum = 0;
            for(int j = 0; j < reach.length; j++){
                for(int k = 0; k < reach[j].length; k++){
                    newarr[j] = (newarr[j] + og[reach[j][k]]) % mod;
                }
                sum = (sum + newarr[j]) % mod;
            }
            og = newarr;
            if(i == n)
            	return sum;
        }
        return 0;
    }
}