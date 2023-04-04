// class Solution {
//     public int partitionString(String s) {
//         int[] alpha = new int[26];
//         int res=1;
//         for(int i=0; i<s.length();i++){
//         	if(alpha[s.charAt(i)-'a']+1>1){
//         		res++;
//         		alpha = new int[26];
//         	}
//         	alpha[s.charAt(i)-'a']++;
//         }
//         return res;
//     }
// }
class Solution {
    public int partitionString(String s) {
        int count = 1;
        boolean[] arr = new boolean[26];
        for (char c : s.toCharArray()) {
            if (arr[c - 'a']) {
                count++;
                arr = new boolean[26];
            }
            arr[c - 'a'] = true;
        }

        return count;
    }
}