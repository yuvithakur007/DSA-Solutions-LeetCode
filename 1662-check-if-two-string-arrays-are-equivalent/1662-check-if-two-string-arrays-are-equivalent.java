class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1="";
        String temp2="";
        for(String c: word1){
            temp1+=c;
        }
        for(String c: word2){
            temp2+=c;
        }
        
        System.out.println(temp1+ " "+ temp2);
        if(temp1.equals(temp2)){
            return true;
        }else{
            return false;
        }
    }
}