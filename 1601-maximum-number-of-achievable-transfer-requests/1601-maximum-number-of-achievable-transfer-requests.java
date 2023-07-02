// class Solution {
//     public int maximumRequests(int n, int[][] requests) {
//         backtrack(0,0,requests,new int[n]);
//         return ans;
//     }
//     int ans=0;
//     private void backtrack(int index,int p,int[][] requests,int[] degree){
//        if(requests.length==index){
//            if(Arrays.stream(degree).allMatch(d -> d == 0)){
//                ans=Math.max(ans,p);
//            }
//            return;
//        }
//      backtrack(index+1,p,requests,degree);
//      --degree[requests[index][0]];
//      ++degree[requests[index][1]];
//      backtrack(index+1,p+1,requests,degree);
//      ++degree[requests[index][0]];
//      --degree[requests[index][1]];

//     }
// }

class Solution {
    public int maximumRequests(int n, int[][] requests) {
        int[] indegree = new int[n];
        return helper(0, requests, indegree, n, 0);
    }

    public int helper(int start, int[][] requests, int[] indegree, int n, int count) {
        if (start == requests.length) {
            for (int i = 0; i < n; i++) {
                if (indegree[i] != 0) {
                    return 0;
                }
            }
            return count;
        }

        // Take 
        indegree[requests[start][0]]--;
        indegree[requests[start][1]]++;
        int take = helper(start + 1, requests, indegree, n, count + 1);

        // Not-take
        indegree[requests[start][0]]++;
        indegree[requests[start][1]]--;
        int notTake = helper(start + 1, requests, indegree, n, count);

        return Math.max(take, notTake);
    }
}
//DC