// Last updated: 7/15/2025, 10:33:56 AM
class Solution {

    static void backtrack(int[] candidates, int target, List<List<Integer>> res, List<Integer> subList, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(subList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            subList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], res, subList, i); // can reuse same number
            subList.remove(subList.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}
