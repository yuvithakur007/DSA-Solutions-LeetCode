// class Solution {
//     public int firstMissingPositive(int[] nums) {
        
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],0);
//         }
//         for(int i=1;i<nums.length+1;i++){
//             if(!map.containsKey(i)){
//                 return i;
//             }
//         }
//        return nums.length+1;
//     }
// }

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        int x=1;
        for(int i=0;i<nums.length;i++){
            if(x==nums[i]) x++;
            
        }
        return x;
    }
}