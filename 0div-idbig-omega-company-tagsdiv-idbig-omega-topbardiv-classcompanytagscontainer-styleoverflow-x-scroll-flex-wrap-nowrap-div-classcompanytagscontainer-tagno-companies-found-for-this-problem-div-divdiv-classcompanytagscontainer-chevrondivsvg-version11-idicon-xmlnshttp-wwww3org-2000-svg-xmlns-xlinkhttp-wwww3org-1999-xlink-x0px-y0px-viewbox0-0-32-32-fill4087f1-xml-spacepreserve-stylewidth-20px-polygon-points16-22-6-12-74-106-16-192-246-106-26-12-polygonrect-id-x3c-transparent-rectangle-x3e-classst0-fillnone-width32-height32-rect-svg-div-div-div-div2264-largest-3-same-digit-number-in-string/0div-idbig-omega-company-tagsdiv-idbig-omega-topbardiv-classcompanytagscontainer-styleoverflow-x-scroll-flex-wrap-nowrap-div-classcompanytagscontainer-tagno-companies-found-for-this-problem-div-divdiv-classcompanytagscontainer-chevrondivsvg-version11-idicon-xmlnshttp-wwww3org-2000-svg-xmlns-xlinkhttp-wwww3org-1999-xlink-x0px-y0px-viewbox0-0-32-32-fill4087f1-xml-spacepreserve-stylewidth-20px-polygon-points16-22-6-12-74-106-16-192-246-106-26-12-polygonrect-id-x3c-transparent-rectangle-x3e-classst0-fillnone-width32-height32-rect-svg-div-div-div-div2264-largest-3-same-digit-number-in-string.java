class Solution
{ 
    public String largestGoodInteger(String num)
    {
        // largest to smallest good integers
        String [] goodIntegers={"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for(String goodInteger:goodIntegers){
            if(num.contains(goodInteger)){
                return goodInteger;
            }
        }
         return "";
    }
}