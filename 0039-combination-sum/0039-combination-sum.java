class Solution {
    // using arraylist
//         public List<List<Integer>> combinationSum(int[] candidates, int target) {
//             List<List<Integer>> result = new ArrayList<List<Integer>>();
//             combinationSum(result,new ArrayList<Integer>(),candidates,target,0);
//             return result;
//         }
        
//         public void combinationSum(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target,int start) {
//             if (target > 0) {
//                 for (int i = start;i < candidates.length;i++) { // not using the condition "target >= candidates[i]"
//                     cur.add(candidates[i]);
//                     combinationSum(result, cur, candidates, target-candidates[i],i);
//                     cur.remove(cur.size() - 1);
//                 }
//             }
//             if (target == 0) 
//                 result.add(new ArrayList<Integer>(cur));
//         }
//     }
    // using linked list
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> result = new ArrayList<>();
            combine(result, new LinkedList<Integer>(), candidates, target);
            return result;
        }
        private void combine(List<List<Integer>> result, LinkedList<Integer> list, int[] arr, int target) {
            if (target == 0) {
                result.add(new LinkedList<Integer>(list));
                return;
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] <= target) {
                    list.addFirst(arr[i]);
                    combine(result, list, Arrays.copyOfRange(arr, 0, i + 1), target - arr[i]);
                    list.removeFirst();
                }
            }
        }
    }
