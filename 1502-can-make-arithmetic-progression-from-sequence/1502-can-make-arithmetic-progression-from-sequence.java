class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        int temp=0;
        int n=arr.length;
        for(int i=1; i<n; i++){
            temp=arr[i]-arr[i-1];
            if(temp != diff){
                return false;
            }
        }
        return true;
    }
}