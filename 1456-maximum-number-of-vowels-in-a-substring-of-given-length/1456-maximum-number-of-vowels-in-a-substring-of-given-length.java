class Solution {
     public boolean vowel(char c){
         return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int maxVowels(String s, int k) {       
        int maxcount=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(vowel(c)){
                count++;
            }
            if(i>=k && vowel(s.charAt(i-k))){
                count--;
            }
            maxcount= Math.max(maxcount, count);
        }
        return maxcount;
    }
}