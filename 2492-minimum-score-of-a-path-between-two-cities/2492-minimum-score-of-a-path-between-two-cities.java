class Solution {
    int[] parent;
    int[] rank;
    int find(int x){
        while(parent[x]!=x){
            x = parent[parent[x]];
        }
        return x;
    }

    void makeUnion(int x, int y){
        int xPar = find(x);
        int yPar = find(y);
        if(xPar == yPar){
            return;
        }
        else if(rank[xPar]<rank[yPar]){
            parent[xPar] = yPar;
        }
        else if(rank[xPar]>rank[yPar]){
            parent[yPar] = xPar;
        }
        else{
            parent[yPar] = xPar;
            rank[xPar]++;
        }
    }
    public int minScore(int n, int[][] roads) {
        parent = new int[n+1];
        rank = new int[n+1];
        for(int i=0; i<n+1; i++){
            parent[i] = i;
        }
        int minPath = Integer.MAX_VALUE;
        for(int[] road : roads){
            makeUnion(road[0], road[1]);
        }

        // start is always node 1
        int xPar = find(1);
        for(int[] road: roads){
            // end can be any node from the roads array
            int yPar = find(road[0]);
            if(xPar == yPar) {
                minPath = Math.min(minPath, road[2]);
            }
        }

        return minPath;
    }
}
