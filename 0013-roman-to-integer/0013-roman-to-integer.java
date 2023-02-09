class Solution {
     public static int romanToInt(String s) {
        int sum = 0,temp=0;

        for (int i = s.length()-1; i >=0 ; i--) {
            int x = value(s.charAt(i));
            int val=x;

            if(val<temp){
                sum-=val;
            }
            else{
                sum+=val;
            }
             temp=x;
        }
        return sum;
    }

    public static  int value(char x) {
        if (x == 'I') {
            return 1;
        }
        if (x == 'V') {
            return 5;
        }
        if (x == 'X') {
            return 10;
        }
        if (x == 'L') {
            return 50;
        }
        if (x == 'C') {
            return 100;
        }
        if (x == 'D') {
            return 500;
        }
        if (x == 'M') {
            return 1000;
        }
        return -1;
    }
}