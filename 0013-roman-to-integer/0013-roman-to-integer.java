class Solution {
    public int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;

                case 'D':
                    nums[i] = 500;
                    break;

                case 'C':
                    nums[i] = 100;
                    break;

                case 'L':
                    nums[i] = 50;
                    break;

                case 'X':
                    nums[i] = 10;
                    break;

                case 'V':
                    nums[i] = 5;
                    break;

                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum + nums[nums.length - 1];
    }
}

// class Solution {
//      public static int romanToInt(String s) {
//         int sum = 0,temp=0;

//         for (int i = s.length()-1; i >=0 ; i--) {
//             int x = value(s.charAt(i));
//             int val=x;

//             if(val<temp){
//                 sum-=val;
//             }
//             else{
//                 sum+=val;
//             }
//              temp=x;
//         }
//         return sum;
//     }

//     public static  int value(char x) {
//         if (x == 'I') {
//             return 1;
//         }
//         if (x == 'V') {
//             return 5;
//         }
//         if (x == 'X') {
//             return 10;
//         }
//         if (x == 'L') {
//             return 50;
//         }
//         if (x == 'C') {
//             return 100;
//         }
//         if (x == 'D') {
//             return 500;
//         }
//         if (x == 'M') {
//             return 1000;
//         }
//         return -1;
//     }
// }