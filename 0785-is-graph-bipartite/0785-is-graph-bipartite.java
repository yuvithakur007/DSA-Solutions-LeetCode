class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length, c = 0;
        int[] color = new int[n];

        Arrays.fill(color, -1);
        for( int i = 0; i < n; i++ ){
            if( color[i] == -1 && !color(i, c=1-c, color, graph) )  return false;
        }

        return true;
    }

    private boolean color( int i , int c, int[] color, int[][] graph ){

        if( color[i] != -1 ){
            return color[i] == c;
        }

        color[i] = c;

        for( int neighbor : graph[i] ){
            if( !color(neighbor, 1-c, color, graph) ) return false;
        }

        return true;

    }
}