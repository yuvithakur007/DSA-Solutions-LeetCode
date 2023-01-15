class Solution {
    public int lengthOfLongestSubstring(String s) {
         // In this approach, we will make a map that will take care of counting the elements and maintaining the frequency of each and every element as a unity by taking the latest index of every element.
     HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
        
        
        // We will have two pointers left and right. Pointer ‘left’ is used for maintaining the starting point of substring while ‘right’ will maintain the endpoint of the substring.’ right’ pointer will move forward and check for the duplicate occurrence of the current element if found then ‘left’ pointer will be shifted ahead so as to delete the duplicate elements.
    //      if(s.length()==0)
    //          return 0;
    //     int maxans = Integer.MIN_VALUE;
    //     Set < Character > set = new HashSet < > ();
    //     int l = 0;
    //     for (int r = 0; r < s.length(); r++) // outer loop for traversing the string
    //     {
    //         if (set.contains(s.charAt(r))) //if duplicate element is found
    //         {
    //             while (l < r && set.contains(s.charAt(r))) {
    //                 set.remove(s.charAt(l));
    //                 l++;
    //             }
    //         }
    //         set.add(s.charAt(r));
    //         maxans = Math.max(maxans, r - l + 1);
    //     }
    //     return maxans;
    // }
}