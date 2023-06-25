
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int temp = 1;
        for(int i = 0; i< nums.length; i++) {
            ans[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         ans[0] = 1;
//         for (int i = 1; i < n; i ++){
//             ans[i] = ans[i-1] * nums[i-1];
//         }
//         int right = 1;
//         for (int i = n-2; i > -1; i --){
//             right = right * nums[i+1];
//             ans[i] = ans[i] * right;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] ans= new int[nums.length];
//         for(int i=0; i<nums.length; i++){
//             int prod=1;
//             for(int j=0; j<nums.length; j++){
//                 if(j!=i){
//                     prod= prod*nums[j];
//                 }                
//             }
//             ans[i]=prod;
//         }
//         return ans;
//     }
// }