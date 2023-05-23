class KthLargest {
    int k;
    List<Integer> arr = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
    }
    
    public int add(int val) {
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-k);

    }
}

// class KthLargest {
//     int k;
//     ArrayList<Integer> arrList;

//     public KthLargest(int k, int[] nums) {
//         this.k = k;
//         arrList = new ArrayList<Integer>();
//         for (int i : nums)
//         {
//             arrList.add(i);
//         }
//     }
    
//     public int add(int val) {
//         arrList.add(val);
//         Collections.sort(arrList, Collections.reverseOrder());
//         return arrList.get(k-1);
//     }
// }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */