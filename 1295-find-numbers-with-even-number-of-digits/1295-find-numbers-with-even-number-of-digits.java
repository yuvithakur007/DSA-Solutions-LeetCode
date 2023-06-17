class Solution {
        public int findNumbers(int[] nums) {
        int even=0,count=0;
        for(int e:nums){
            while(e>0){
                e=e/10;
                count++;           
            }
            if(count%2==0) even++;
            count=0;
        }
        return even;
    }
}
