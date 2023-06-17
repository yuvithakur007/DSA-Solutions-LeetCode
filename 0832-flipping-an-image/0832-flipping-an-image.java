// class Solution {
//         public int[][] flipAndInvertImage(int[][] image) {
//         for(int[] row:image){
//             for(int i=0;i<(image.length+1)/2;i++){
//                 int temp=row[i]^1;
//                 row[i]=row[image[0].length-i-1]^1;
//                 row[image[0].length-1-i]=temp;
//             }
//         }
//         return image;
//     }
// }

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        if (image == null || image.length == 0 || image[0].length == 0) {
            return image;
        }

        for (int[] row : image) {
            int start = 0;
            int end = row.length - 1;
            while (start <= end) {
                if (row[start] == row[end]) {
                    row[start] ^= 1;
                    row[end] = row[start];
                }
                start++;
                end--;
            }
        }

        return image;
    }
}