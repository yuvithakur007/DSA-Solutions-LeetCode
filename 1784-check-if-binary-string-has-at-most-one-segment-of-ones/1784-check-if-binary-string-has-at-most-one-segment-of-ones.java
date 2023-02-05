class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        int c=0;
        if(n==1)
            return true;
        for(int i=n-1;i>0;i--)
        {   if(s.charAt(i)=='1' && s.charAt(i-1)=='0')
                return false;     
        }
        return true;   
    }
}