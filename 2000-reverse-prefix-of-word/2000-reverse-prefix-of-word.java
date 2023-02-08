class Solution { 
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch) + 1;
        if(index < 2)
            return word;
        
        StringBuilder sb = new StringBuilder(word.substring(0, index));
        sb.reverse();
        sb.append(word.substring(index));
        
        return sb.toString();
        
        // char[] c = word.toCharArray();
        // int locate = 0;
        // for (int i = 0; i < word.length(); i++) { //first occurrence of ch
        //     if (ch == c[i]) {
        //         locate = i;
        //         break;
        //     }
        // }
        // char[] res = new char[word.length()];
        // for (int i = 0; i <= locate; i++) {
        //     res[i] = c[locate - i];
        // }
        // for (int i = locate + 1; i < word.length(); i++) {
        //     res[i] = c[i];
        // }
        // return String.valueOf(res);
    }
}