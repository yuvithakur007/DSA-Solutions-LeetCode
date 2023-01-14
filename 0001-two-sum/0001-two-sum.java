class Solution {
    public int[] twoSum(int[] nums, int target) {
	//  HASH MAP APPROACH 
        int[] result = new int [2];       
        // map: key --> index
        // Integer --> integer   
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i<nums.length; i++)
        {
            if (map.containsKey(target-nums[i]) == true)
            {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            map.put (nums[i], i);
        }
        return result;
    }
}
