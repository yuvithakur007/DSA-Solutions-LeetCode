class Solution {
    public int lastStoneWeight(int[] stones) {
        // Create a priority queue to store the stones in descending order
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // Add all the stones to the queue
        for(int ele : stones){
            queue.add(ele);
        }
        // Keep smashing stones until only one or zero stones remain in the queue
        while(queue.size() > 1){
            // Get the two heaviest stones
            int x = queue.poll();
            int y = queue.poll();
            // If the two stones are different, smash them and add the remaining weight to the queue
            if(x != y){
                y = x - y;
                queue.offer(y);
            }
            // If the two stones are the same, destroy them and continue to the next iteration
            else{
                continue;
            }
        }
        // Return the remaining stone weight, which is the only element left in the queue if there is one
        // If the queue is empty, return 0 since all the stones have been destroyed
        return queue.isEmpty() ? 0 : queue.poll();
    }
}