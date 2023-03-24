class Solution {
    public int minReorder(int n, int[][] connections) {
        HashSet<String> set = new HashSet<>();
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0 ; i < n ; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] e : connections) {
            int u = e[0], v = e[1];
            graph[u].add(v);
            graph[v].add(u);
            set.add(u + "->" + v);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int res = 0;
        boolean[] vis = new boolean[n];
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                int rem = q.remove();
                vis[rem] = true;
                for(int e : graph[rem]) {
                    if(!vis[e]) {
                        if(set.contains(rem + "->" + e)) res++;
                        q.add(e);   
                    }
                }
            }
        }
        return res;
    }
}