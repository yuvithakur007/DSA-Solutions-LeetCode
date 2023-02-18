class Solution {
        public int[] shuffle(int[] nums, int n) 
        {
            int[] res=new int[2*n];      
            int c=0;
            for(int i=0;i<2*n;i+=2)
            {
                res[i]=nums[c];
                res[i+1]=nums[n+c];
                c++;
            }
            return res;
        }
        // public int[] shuffle(int[] nums, int n) 
        // {
        //     int[] result = new int[2*n];
        //     int j = 0;
        //     for(int i=0;i<n;i++)
        //     {
        //         result[j] = nums[i];
        //         j++;
        //         result[j] = nums[i+n];
        //         j++;
        //     }
        //     return result;
        //  }
//     public int[] shuffle(int[] nums, int n) {
       
//         int[] ans = new int[2*n];
        
//         for(int i=0;i<n;i++){
//             ans[2*i]=nums[i];
//             ans[2*i+1]=nums[i+n];
//         }
//         return ans;
        
//     }
}