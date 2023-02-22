class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        int res = 0;
        if(weights.length < days) res = -1;
        for(int i = 0; i< weights.length; i++){
            max = Math.max(max , weights[i]);
            sum += weights[i];
        }
        int low = max ; 
        int high = sum; 
        int mid = 0;
        
        while(low <= high){
            mid = low + (high - low)/2;
            if(isvalid(weights, mid , days)){
                res = mid;
                high = mid - 1;
                
            }
            else{
                low = mid +1;
            }
        }
        return res;
    }
    public static boolean isvalid(int [] weights , int mid , int days){
        int n = weights.length;
        int d = 1;
        int sum = 0;
      for( int i = 0; i< n ; i++){
          sum += weights[i];
          if(sum > mid){
              d++;
              sum = weights[i];
          }
      }
        if(d> days) return false;
        return true;
    }
}