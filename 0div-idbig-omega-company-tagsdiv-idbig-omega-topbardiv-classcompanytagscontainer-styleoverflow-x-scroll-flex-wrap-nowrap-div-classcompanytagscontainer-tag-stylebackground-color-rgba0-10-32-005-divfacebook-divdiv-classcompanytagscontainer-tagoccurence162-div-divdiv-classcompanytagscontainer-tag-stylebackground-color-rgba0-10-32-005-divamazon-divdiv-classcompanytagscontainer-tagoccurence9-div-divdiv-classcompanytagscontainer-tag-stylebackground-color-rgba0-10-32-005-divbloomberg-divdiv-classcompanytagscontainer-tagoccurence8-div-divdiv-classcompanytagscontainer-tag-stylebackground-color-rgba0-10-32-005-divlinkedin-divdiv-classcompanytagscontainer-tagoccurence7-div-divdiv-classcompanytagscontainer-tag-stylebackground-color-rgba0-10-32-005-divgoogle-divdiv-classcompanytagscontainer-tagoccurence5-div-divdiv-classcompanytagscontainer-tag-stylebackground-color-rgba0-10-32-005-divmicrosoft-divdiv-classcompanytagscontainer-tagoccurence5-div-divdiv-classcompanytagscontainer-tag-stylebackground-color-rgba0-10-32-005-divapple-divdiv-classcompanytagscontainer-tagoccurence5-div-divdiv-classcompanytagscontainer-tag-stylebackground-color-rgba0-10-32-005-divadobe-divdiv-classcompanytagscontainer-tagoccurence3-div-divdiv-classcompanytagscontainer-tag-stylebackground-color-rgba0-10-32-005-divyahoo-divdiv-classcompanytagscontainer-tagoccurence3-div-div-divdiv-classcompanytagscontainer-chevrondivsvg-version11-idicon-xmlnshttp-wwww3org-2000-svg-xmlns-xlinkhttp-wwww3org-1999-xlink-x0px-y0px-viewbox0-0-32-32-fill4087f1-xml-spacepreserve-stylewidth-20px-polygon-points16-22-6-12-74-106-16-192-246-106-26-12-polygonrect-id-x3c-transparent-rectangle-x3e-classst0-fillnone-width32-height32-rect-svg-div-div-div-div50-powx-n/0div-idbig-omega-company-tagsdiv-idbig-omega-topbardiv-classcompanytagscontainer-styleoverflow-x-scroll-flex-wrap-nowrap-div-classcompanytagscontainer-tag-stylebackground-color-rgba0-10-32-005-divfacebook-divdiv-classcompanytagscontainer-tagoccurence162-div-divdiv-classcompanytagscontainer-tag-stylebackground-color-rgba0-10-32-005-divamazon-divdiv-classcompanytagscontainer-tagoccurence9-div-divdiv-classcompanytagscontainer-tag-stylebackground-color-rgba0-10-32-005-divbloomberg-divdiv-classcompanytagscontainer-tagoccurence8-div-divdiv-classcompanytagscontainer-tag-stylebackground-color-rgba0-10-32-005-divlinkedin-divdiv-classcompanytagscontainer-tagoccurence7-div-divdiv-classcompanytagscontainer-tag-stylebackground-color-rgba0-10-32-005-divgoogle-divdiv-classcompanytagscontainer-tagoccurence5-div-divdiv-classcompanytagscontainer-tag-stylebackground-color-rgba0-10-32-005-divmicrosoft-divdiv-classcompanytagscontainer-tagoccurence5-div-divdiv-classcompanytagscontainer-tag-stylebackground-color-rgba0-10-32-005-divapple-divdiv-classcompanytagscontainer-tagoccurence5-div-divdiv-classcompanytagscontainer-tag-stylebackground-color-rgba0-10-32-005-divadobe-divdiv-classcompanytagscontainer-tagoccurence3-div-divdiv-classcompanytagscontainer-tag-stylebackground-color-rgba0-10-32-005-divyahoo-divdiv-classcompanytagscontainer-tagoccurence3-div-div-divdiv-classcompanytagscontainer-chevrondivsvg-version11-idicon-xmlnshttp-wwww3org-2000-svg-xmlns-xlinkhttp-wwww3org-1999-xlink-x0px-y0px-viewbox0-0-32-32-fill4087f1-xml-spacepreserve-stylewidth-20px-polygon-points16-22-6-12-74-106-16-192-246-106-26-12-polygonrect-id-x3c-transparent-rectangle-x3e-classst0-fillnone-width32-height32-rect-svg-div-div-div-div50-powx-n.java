class Solution {
 public static double myPow(double x, int n) {
    double ans = 1.0;
    long nn = n; // for not overflow if negative --> positive (range)
    if (nn < 0) nn = -1 * nn; // make power positive
    while (nn > 0) {
      if (nn % 2 == 1) {
          //for odd power
        ans = ans * x;
        nn = nn - 1;
      } else {
          //for even power
        x = x * x;
        nn = nn / 2;
      }
    }
     // check n value in initially is negative then divide 1/ans
    if (n < 0) ans = (double)(1.0) / (double)(ans);
    return ans;
  }
}    

    