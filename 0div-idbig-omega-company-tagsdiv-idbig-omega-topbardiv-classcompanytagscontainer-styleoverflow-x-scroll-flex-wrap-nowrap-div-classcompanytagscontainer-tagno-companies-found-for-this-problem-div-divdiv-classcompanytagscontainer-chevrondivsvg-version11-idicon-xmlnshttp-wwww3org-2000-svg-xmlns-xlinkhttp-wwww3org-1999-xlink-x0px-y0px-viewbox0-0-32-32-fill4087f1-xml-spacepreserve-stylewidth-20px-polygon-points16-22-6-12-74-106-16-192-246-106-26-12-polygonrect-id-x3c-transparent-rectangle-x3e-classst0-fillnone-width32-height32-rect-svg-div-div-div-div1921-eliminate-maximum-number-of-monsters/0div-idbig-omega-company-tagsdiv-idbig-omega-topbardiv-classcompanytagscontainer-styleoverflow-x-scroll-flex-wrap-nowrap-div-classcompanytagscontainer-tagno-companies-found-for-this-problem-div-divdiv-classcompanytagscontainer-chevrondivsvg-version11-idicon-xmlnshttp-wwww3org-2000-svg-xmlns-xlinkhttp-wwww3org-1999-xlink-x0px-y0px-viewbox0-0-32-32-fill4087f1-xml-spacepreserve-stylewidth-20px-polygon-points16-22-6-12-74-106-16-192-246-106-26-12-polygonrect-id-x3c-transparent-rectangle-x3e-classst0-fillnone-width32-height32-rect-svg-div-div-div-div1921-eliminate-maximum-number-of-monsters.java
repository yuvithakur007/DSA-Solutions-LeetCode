class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        
        int n = dist.length;
        
        int[] time = new int[n];
        
        for(int i = 0; i < n; i++){
            time[i] = (int)Math.ceil(dist[i] * 1.0 / speed[i]);
        }
        
        Arrays.sort(time);
        
        int eliminated = 0;
        
        for(int i = 0; i < n; i++){
			 
            if(time[i] > i){  
                eliminated++;
            }else{
                break; 
            }
        }
        
        return eliminated;
    }
}