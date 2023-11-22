import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int n = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                mp.computeIfAbsent(i + j, k -> new ArrayList<>()).add(nums.get(i).get(j));
                n = Math.max(n, i + j);
            }
        }
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> values = mp.get(i);
            if (values != null) {
                for (int j = values.size() - 1; j >= 0; j--) {
                    resList.add(values.get(j));
                }
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}