class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mi[i] == mx[j])  {
                    res.add(mi[i]);
                    break;           
                }
            }
        }
     return res;
    }
}

// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {
//         ArrayList<Integer> minimum=new ArrayList<>();
//         ArrayList<Integer> maximum=new ArrayList<>();
//         for(int i=0;i<matrix.length;i++){
//             int min=Integer.MAX_VALUE;
//             for(int j=0;j<matrix[i].length;j++){
//                 if(matrix[i][j]<min){
//                     min=matrix[i][j];
//                 }
//             }
//             minimum.add(min);
//         }
//         for(int i=0;i<matrix[0].length;i++){
//             int max=Integer.MIN_VALUE;
//             for(int j=0;j< matrix.length;j++){
//                 if(matrix[j][i]>max){
//                     max=matrix[j][i];
//                 }
//             }
//             maximum.add(max);
//         }
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int i=0;i< minimum.size();i++){
//             for(int j=0;j< maximum.size();j++){
//                 if(minimum.get(i).equals(maximum.get(j))){
//                     list.add(minimum.get(i));
//                 }
//             }
//         }
//         return list;
//     }
// }