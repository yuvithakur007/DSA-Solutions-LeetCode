class Solution {
    public int countHomogenous(String s) {
        
        char ch = s.charAt(0);
        long total = 1;
        int count = 1, mod = (int)1e9 + 7;
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ch) {
                count++;
                total += count;
            }
            else {
                ch = s.charAt(i);
                count = 1;
                total += count;
            }
        }
        
        return (int)(total % mod);
        
    }
}