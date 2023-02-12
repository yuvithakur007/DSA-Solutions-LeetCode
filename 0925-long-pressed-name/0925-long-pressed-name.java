class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name == null || name.length() == 0) return false;
        if (typed.length() < name.length()) return false;
        if (typed.length() == name.length()) return name.equals(typed);
        int i = 0;
        int j = 0;
        while (i < name.length()) {
            char nameChar = name.charAt(i);
            int count = 1;
            i++;
            while (i < name.length() && name.charAt(i) == nameChar) {
                i++;
                count++;
            }
            while (j < typed.length() && typed.charAt(j) == nameChar) {
                j++;
                count--;
            }
            if (count > 0) {
                return false;
            }         
        }
        if (j != typed.length()) {
            return false;
        }
        return true;
    }
}