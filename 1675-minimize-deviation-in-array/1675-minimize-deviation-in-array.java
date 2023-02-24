class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int minVal = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 1)
                num = num * 2;
            pq.offer(num);
            minVal = Math.min(minVal, num);
        }
        int minDeviation = Integer.MAX_VALUE;
        while (true) {
            int maxVal = pq.poll();
            minDeviation = Math.min(minDeviation, maxVal - minVal);
            if (maxVal % 2 == 1)
                break;
            maxVal = maxVal / 2;
            minVal = Math.min(minVal, maxVal);
            pq.offer(maxVal);
        }
        return minDeviation;
    }
}
// class Solution {
//     public int minimumDeviation(int[] nums) {
//         TreeSet<Integer> temp = new TreeSet<>();
//         for(int i: nums){
//             if(i % 2 == 0){
//                 temp.add(i);
//             }
//             else{
//                 temp.add(i * 2);
//             }
//         }        
//         int md = temp.last() - temp.first();
//         int m = 0;
        
//         while(temp.size() > 0 && temp.last() % 2 == 0){
//             m = temp.last();
//             temp.remove(m);
//             temp.add(m / 2);
            
//             md = Math.min(md, temp.last() - temp.first());
//         }
//         return md;
//     }
// }