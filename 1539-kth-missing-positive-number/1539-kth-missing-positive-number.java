class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int i=0;
        int j=1;      //first positive;
        while(i<arr.length){
            if(arr[i]!=j){
                count++;                
                if(count==k) return j;
                j++;               // we aren't incrementing i here beacuse we want missing positives till arr[i]
            }
            else{                      //else will run when positive exists in the given array
                i++;
                j++;
            }
        }
        return arr.length+k;                       //otherwise
    }
}