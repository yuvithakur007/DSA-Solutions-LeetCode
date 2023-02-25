class Solution {
    public int maxProfit(int[] arr) {
        int minPrice=arr[0];
        int maxProfit=0;
        for(int i=0; i<arr.length; i++){
            minPrice= Math.min(minPrice, arr[i]);
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }
        return maxProfit;
    }
}
        // test cases failed
        // int maxProfit = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] > arr[i]) {
        //             maxProfit = Math.max(arr[j] - arr[i], maxProfit);
        //         }
        //     }
        // }