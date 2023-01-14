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
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.length ; i++){
//             for(int j = i+1; j < nums.length ; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return null;
//     }
// }