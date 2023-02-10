public class Solution {
    public int strStr(String haystack, String needle) {
       for (int i = 0; ; i++) { // The length of haystack
    for (int j = 0; ; j++) { // The length of needle
      if (j == needle.length()) return i; // If at this point we have navigated through the entire length of needle, we have found a solution, haystack[i].
      if (i + j == haystack.length()) return -1; // This happens when we run out of elements in haystack, but there are still elements in needle. 
      if (needle.charAt(j) != haystack.charAt(i + j)) break; // We stop comparing after needle[j], so i will be incremented and cycle repeats itself.
        }
      }
    }
    
    // public int strStr(String haystack, String needle) {
    //     int l1 = haystack.length(), l2 = needle.length();
    //     if (l1 < l2) {
    //         return -1;
    //     } else if (l2 == 0) {
    //         return 0;
    //     }
    //     int threshold = l1 - l2;
    //     for (int i = 0; i <= threshold; ++i) {
    //         if (haystack.substring(i,i+l2).equals(needle)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// }