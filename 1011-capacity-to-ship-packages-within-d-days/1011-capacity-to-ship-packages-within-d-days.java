class Solution {
    public int shipWithinDays(int[] weights, int days) {        
        int l = 0, r = 0;
        for(int w : weights) {
            l = Math.max(l, w);
            r += w;
        }        
        while(l < r) {
            int mid = l + (r - l) / 2, cur = 0, need = 1;
            for(int w : weights) {
                if(cur + w > mid) {
                    need++;
                    cur = 0;
                }
                cur += w;
            }            
            if(need > days) 
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}
// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int left = 0;
//         int right = 0;
//         for(int i :weights){
//             left = Math.max(left,i);
//             right +=i;
//         }
//         int mid;
//         int ans = right;
//         while(left<=right){
//             mid = (left+right)/2;
//             if(check(weights,days,mid)){
//                 ans = mid;
//                 right = mid-1;
//             }else{
//                 left = mid+1;
//             }
//         }
//         return ans;
//     }

//     public boolean check(int [] weights, int days, int capacity){
//         int requiredDays = 1;
//         int currWeight = 0;
//         for(int i:weights){
//             if(currWeight+i>capacity){
//                 requiredDays++;
//                 currWeight = 0;
//             }
//             currWeight +=i;
//         }
//         if(requiredDays>days) return false;
//         return true;
//     }
// }