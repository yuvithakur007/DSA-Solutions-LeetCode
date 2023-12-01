class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder temp1=new StringBuilder();
        StringBuilder temp2=new StringBuilder();
        for(String s:word1)
            temp1.append(s);
        for(String s:word2)
            temp2.append(s);
        
        // System.out.println(temp1+ " "+ temp2);
        if(temp1.toString().equals(temp2.toString())){
            return true;
        }else{
            return false;
        }
        
        // String s1="";
        // String s2="";
        // for(int i=0;i<word1.length;i++){
        //     s1+=word1[i];
        // }
        // for(int j=0;j<word2.length;j++){
        //     s2+=word2[j];
        // }
        // if(s1.equals(s2)){
        //     return true;
        // }
        // return false;
    }
}