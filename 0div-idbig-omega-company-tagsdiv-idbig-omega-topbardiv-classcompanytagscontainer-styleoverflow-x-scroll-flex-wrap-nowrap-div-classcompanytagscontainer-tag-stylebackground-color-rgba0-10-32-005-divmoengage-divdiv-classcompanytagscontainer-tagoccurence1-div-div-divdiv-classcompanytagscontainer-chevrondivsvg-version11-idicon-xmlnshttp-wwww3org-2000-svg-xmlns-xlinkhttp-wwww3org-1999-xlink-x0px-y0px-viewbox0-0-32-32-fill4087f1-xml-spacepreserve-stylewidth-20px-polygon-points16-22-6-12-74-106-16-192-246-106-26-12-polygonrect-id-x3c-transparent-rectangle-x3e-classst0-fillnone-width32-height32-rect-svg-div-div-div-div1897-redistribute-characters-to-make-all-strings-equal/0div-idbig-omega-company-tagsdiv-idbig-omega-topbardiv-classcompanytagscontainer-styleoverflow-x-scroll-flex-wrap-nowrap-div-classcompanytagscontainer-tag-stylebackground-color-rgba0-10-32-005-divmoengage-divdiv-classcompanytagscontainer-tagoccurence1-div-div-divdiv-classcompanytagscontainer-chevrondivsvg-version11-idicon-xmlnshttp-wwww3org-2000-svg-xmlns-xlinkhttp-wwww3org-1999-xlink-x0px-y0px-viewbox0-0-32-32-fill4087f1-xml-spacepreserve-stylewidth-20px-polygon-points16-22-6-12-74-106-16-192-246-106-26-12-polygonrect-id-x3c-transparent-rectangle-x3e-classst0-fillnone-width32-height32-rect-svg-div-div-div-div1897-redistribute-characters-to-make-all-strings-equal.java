class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int f[] = new int[26];
// store the frequency of each character.
        for(String word: words) {
            for(char c: word.toCharArray()) f[c - 'a']++;
        }
// check if we can divide the character into n strings evenly on not.
        for(int x: f) if(x % n != 0) return false;
        return true;
    }
}