// Last updated: 7/15/2025, 11:48:45 AM
class Solution {

    static void backtrack(int[] candidates, int target, List<List<Integer>> res, List<Integer> subList, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(subList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If current number exceeds target, break (sorted array)
            if (candidates[i] > target) break;

            subList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], res, subList, i + 1); // move to next index
            subList.remove(subList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // sort to handle duplicates and early stopping
        backtrack(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}
