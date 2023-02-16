class Solution {
    
    
       public int maximumWealth(int[][] accounts) 
    {
        int max=0;
        for(int i=0; i<accounts.length; i++)
            max = Math.max(max, totalWealth(accounts[i]));
        return max;
    }
    
    int totalWealth(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];
        return sum;
    }
    
    
    
    
//     public int maximumWealth(int[][] accounts) 
//     {
//         int maxWealth=0;
        
//         for(int i=0; i<accounts.length; i++)
//         {
//             int wealth=0;
//             for(int j=0; j<accounts[i].length; j++)
//             {
//                 wealth+=accounts[i][j];
//             }
//             if(wealth>maxWealth)
//             {
//                 maxWealth=wealth;
//             }
//         }
//         return maxWealth;
//     }
}