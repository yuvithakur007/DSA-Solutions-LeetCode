class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0, hold = -prices[0];

        for(int i=1;i<prices.length;i++){
            cash = Math.max(cash, prices[i]+hold-fee); // prices[i]+hold-fee represents buying a stock and then the cash is updated
            hold = Math.max(hold, cash-prices[i]); //cash-prices[i] indicate selling the day's stock
        }
        return cash;
    }
}
    
    
// class Solution {
//     public int maxProfit(int[] prices, int fee) {
//         int free = 0;
//         int hold = -prices[0];
//         for(int i:prices){
//             int tmp = hold;
//             hold = Math.max(hold, free-i);
//             free = Math.max(free, tmp+i-fee);
//         }
//         return free;
//     }
// }