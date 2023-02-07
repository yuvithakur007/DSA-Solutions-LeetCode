class Solution {
    public int lengthOfLastWord(String s) {
         String trim = s.trim();
        int afterLastSpaceIndex = trim.lastIndexOf(' ') + 1;
        return trim.length() - afterLastSpaceIndex;
        // int lastWordLength = 0;
        // for(int i=s.length()-1; i>=0; i--) {
        //     char ch = s.charAt(i);
        //     if(ch != ' ') {
        //         lastWordLength++;
        //     } else if(lastWordLength > 0) {
        //         return lastWordLength;
        //     }
        // }
        // return lastWordLength;
    }
}