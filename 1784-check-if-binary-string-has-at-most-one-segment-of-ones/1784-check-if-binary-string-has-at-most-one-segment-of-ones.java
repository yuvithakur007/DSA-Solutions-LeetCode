class Solution {
    public boolean checkOnesSegment(String s) {
        //XOR
        int count = 0;
        char ch = '1';

        for (char c : s.toCharArray()) {
            if ((c ^ ch) == 1) {
                ++count;
                ch = c;
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
        
        // return !s.contains("01");
        
        // int n=s.length();
        // int c=0;
        // if(n==1)
        //     return true;
        // for(int i=n-1;i>0;i--)
        // {   if(s.charAt(i)=='1' && s.charAt(i-1)=='0')
        //         return false;     
        // }
        // return true;   
    }
}