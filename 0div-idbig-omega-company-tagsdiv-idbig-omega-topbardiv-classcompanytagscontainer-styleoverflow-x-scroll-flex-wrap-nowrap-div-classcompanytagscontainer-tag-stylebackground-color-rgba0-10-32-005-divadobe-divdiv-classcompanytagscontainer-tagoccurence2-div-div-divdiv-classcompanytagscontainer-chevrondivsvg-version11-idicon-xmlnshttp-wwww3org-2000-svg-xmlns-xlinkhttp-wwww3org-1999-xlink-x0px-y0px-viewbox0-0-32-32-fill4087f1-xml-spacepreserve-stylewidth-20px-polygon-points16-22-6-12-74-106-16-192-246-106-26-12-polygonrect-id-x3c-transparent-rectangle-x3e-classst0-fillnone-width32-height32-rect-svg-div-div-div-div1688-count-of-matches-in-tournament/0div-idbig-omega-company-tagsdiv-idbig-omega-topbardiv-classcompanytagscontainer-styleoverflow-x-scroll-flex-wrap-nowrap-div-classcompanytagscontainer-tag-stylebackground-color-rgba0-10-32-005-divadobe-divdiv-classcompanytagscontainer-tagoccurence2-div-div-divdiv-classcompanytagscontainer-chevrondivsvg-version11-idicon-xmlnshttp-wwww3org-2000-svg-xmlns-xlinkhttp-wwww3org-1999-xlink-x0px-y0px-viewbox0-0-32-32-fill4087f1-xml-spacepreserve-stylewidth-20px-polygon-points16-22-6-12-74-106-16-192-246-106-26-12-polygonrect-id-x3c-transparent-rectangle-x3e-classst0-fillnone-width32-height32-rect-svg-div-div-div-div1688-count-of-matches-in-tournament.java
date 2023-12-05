class Solution {
    public int numberOfMatches(int n) {
        // return n-1;
        int num=0;
         while(n>1){
              num+=n/2;
              n=(n/2)+(n%2);
          }
          return num; 
          }
}