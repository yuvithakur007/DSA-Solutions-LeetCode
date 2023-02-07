class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        for(int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            if(ch != ' ') {
                lastWordLength++;
            } else if(lastWordLength > 0) {
                return lastWordLength;
            }
        }
        return lastWordLength;
    }
}