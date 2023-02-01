class Solution {
    public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
    //     int n=digits.length-1;
    //     if (digits[n] < 9) {
    //         digits[n]++;
    //         return digits;
    //     }
    // digits[n] = 0;    
    // digits = new int[digits.length + 1];
    // digits[0] = 1;
    // return digits;        
    }
}