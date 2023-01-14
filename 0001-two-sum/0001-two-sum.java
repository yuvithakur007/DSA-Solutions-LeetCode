class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<nums.length; i++){
           int secondInt = target - nums[i];
           if(map.containsKey(secondInt)){
               return new int[] {i, map.get(secondInt) };
           }else{
               map.put(nums[i], i);
           }
       } 
       return null;
        
    }
}
