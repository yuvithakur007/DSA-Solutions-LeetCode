class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return Collections.emptyList();
        String[] phone = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone, output);
        return output;
    }

    private void backtrack(String combination, String next, String[] phone, List<String> output ){
        if(next.isEmpty()){
            output.add(combination);
        }else{
            String letters = phone[next.charAt(0) -'2'];
            for (char letter: letters.toCharArray()){
                backtrack(combination + letter, next.substring(1), phone, output);
            }              
        }
    }
}