class Solution {
     public int minSpeedOnTime(int[] dist, double hour) {        
            int low = 1;
            // max is the max_speed=10^7, because max distance is 10^5 
            // Given in constraints - There will be at most two digits after 
            // the decimal point in hour, so max_speed = 10^5/0.01 = 10^7 
            int high = 100000000;

            int ans = Integer.MAX_VALUE;
            while(low <= high) {
                int mid = low + (high - low)/2;
                if(canReachOfficeWithinTime(dist, mid, hour)) {
                    ans = Math.min(ans, mid);
                    high = mid - 1;
                } 
                else {
                    low = mid + 1;
                }
            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }

        public boolean canReachOfficeWithinTime(int[] dist, int currHour, double maxHour) {
            double hoursTaken = 0;
            for(int i = 0; i < dist.length; ++i) {
                double temp = dist[i]/(currHour * 1.0);
                if(i == dist.length - 1) 
                    hoursTaken += temp;
                else 
                    hoursTaken += Math.ceil(temp);

                if(hoursTaken > maxHour)
                    return false;
            }
            return hoursTaken <= maxHour;
        }
//     public int minSpeedOnTime(int[] dist, double hour) {
//         int left = 1;
//         int right = (int) 1e8;

//         while (left < right) {
//             int middle = (left + right) / 2;
//             if (arriveOnTime(dist, hour, middle))
//                 right = middle;
//             else left = middle + 1;
//         }

//         return right == (int) 1e8 ? -1 : right;
//     }

//     private boolean arriveOnTime(int[] dist, double hour, int speed) {
//         int time = 0;
//         for (int i = 0; i < dist.length - 1; i++) {
//             time += Math.ceil((double) dist[i] / speed);
//         }
//         return time + (double) dist[dist.length - 1] / speed <= hour;
//     }
}
//DC 