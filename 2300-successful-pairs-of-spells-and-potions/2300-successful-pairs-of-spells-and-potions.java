class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ans[]=new int[spells.length];
        Arrays.sort(potions);
        
        for(int i=0;i<spells.length;i++){
            int strt=0;
            int end=potions.length;
            while(strt<end){
                int mid=strt+(end-strt)/2;
                
                long temp=(long)spells[i]*potions[mid];
                if(temp>=success){
                    end=mid;
                }
                else{
                    strt=mid+1;
                }
            }
            ans[i]=potions.length-strt;
        }
        return ans;
    }
}