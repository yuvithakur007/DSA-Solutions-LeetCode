class Solution {
    public int numIdenticalPairs(int[] nums)
    {
        int freq[]= new int[101];
        int goodPair=0;
        for(int i:nums)
        {
             goodPair+= freq[i];
             freq[i]++;
        }
        return goodPair;
    }
}