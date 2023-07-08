class Solution {
    public long putMarbles(int[] weights, int k) {
        int n= weights.length;
        ArrayList<Long> list= new ArrayList<>();
        for(int i=0; i<n-1; i++){
            list.add((long)(weights[i]+weights[i+1]));
        }
        Collections.sort(list);
        long l=0, r=0;
        int size = list.size();
        for (int i = 0; i < k-1; i++) {
            if (i < size)
                l += list.get(i);
            if (size - i - 1 >= 0)
                r += list.get(size - i - 1);
        }
        return Math.abs(r - l);
    }
}