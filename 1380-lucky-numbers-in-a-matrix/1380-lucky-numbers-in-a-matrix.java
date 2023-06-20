class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> minimum=new ArrayList<>();
        ArrayList<Integer> maximum=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            minimum.add(min);
        }
        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j< matrix.length;j++){
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            maximum.add(max);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< minimum.size();i++){
            for(int j=0;j< maximum.size();j++){
                if(minimum.get(i).equals(maximum.get(j))){
                    list.add(minimum.get(i));
                }
            }
        }
        return list;
    }
}