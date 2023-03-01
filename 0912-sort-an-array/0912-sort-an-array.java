class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int a[]=new int[nums.length];
        for(int i:nums) pq.add(i);
        for(int i=0;i<nums.length;i++){
            a[i]=pq.poll();
        }
        return a;
    }
}