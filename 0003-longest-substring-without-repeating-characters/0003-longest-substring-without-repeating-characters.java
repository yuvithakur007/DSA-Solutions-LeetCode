class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int len =s.length();
        for(int i=0 ; i<len; i++){
            int[] freq = new int[128];
            for(int j=i; j<len; j++){
            char c= s.charAt(j);
                freq[c]++;
                if(freq[c]>=2){
                    break;
                }
                max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
}