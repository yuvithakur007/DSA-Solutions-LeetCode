class Solution {
    private int row, column;

    //appleCounts[i][j] is the amount of apples in the pizza rectangular (i,j) ~ (row - 1, column - 1)
    private int[][] appleCounts;

    // waysOfCutting[i][j][k] is the number of ways of cutting the pizza rectangular (i,j) ~ (row - 1, column - 1) into k pieces
    private int[][][] waysOfCutting;

    private int MOD = 1_000_000_007;

    public int ways(String[] pizza, int k) {
        row = pizza.length;
        column = pizza[0].length();

        appleCounts = new int[row][column];
        waysOfCutting = new int[row][column][k + 1];

        for(int i = row - 1; i >= 0; i --){
            for(int j = column - 1; j >= 0; j --){
                Arrays.fill(waysOfCutting[i][j], -1);
                int appleInCurrentCell = pizza[i].charAt(j) == 'A'? 1 : 0;
                if(i != row - 1 && j != column - 1){
                    appleCounts[i][j] = appleInCurrentCell + appleCounts[i + 1][j] + appleCounts[i][j + 1] - appleCounts[i + 1][j + 1];
                }
                else if(i == row - 1 && j == column - 1){
                    appleCounts[i][j] = appleInCurrentCell;
                }
                else if(i == row - 1 && j != column - 1){
                    appleCounts[i][j] = appleInCurrentCell + appleCounts[i][j + 1];
                }
                else{ // if i != row - 1 && j == column - 1
                    appleCounts[i][j] = appleInCurrentCell + appleCounts[i + 1][j];
                }
            }
        }

        return waysOfCuttingPizza(pizza, 0, 0, k);
    }

    private int waysOfCuttingPizza(String[] pizza, int i, int j, int k){
        if(waysOfCutting[i][j][k] != -1){
            return waysOfCutting[i][j][k];
        }

        if(appleCounts[i][j] == 0){
            waysOfCutting[i][j][k] = 0;
            return 0;
        }

        if(k == 1){
            return 1;
        }

        // Cut vertically
        int res = 0;
        for(int cut = j + 1; cut < column; cut ++){
            int applesInLeftPart = appleCounts[i][j] - appleCounts[i][cut];
            if(applesInLeftPart != 0){
                res += waysOfCuttingPizza(pizza, i, cut, k - 1) % MOD;
                res %= MOD;
            }
        }

        // Cut horizontally
        for(int cut = i + 1; cut < row; cut ++){
            int applesInAbovePart = appleCounts[i][j] - appleCounts[cut][j];
            if(applesInAbovePart != 0){
                res += waysOfCuttingPizza(pizza, cut, j, k - 1) % MOD;
                res %= MOD;
            }
        }

        waysOfCutting[i][j][k] = res;
        return res;
    }
}