class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[][] ans= new int[arr.length][2];
        for(int i=0;i<arr.length;i++)
        {
            ans[i][0]=Integer.bitCount(arr[i]);
            ans[i][1]=arr[i];
        }
        Arrays.sort(ans,(a,b)->a[0]-b[0]);
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ans[i][1];
        }
        return arr;
    }
}