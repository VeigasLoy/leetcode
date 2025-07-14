// Last updated: 7/14/2025, 10:42:13 AM
class Solution {
    static boolean isSorted(ArrayList<Integer> al){
        ArrayList<Integer> arr = new ArrayList<>(al);
        Collections.sort(arr);
        for(int i = 0;i<al.size();i++){
            if(al.get(i)!=arr.get(i))
                return false;
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            al.add(num);
        }

        while(!isSorted(al)){
            int minSum = Integer.MAX_VALUE;
        int index = -1;
    
        for (int i = 0; i < al.size() - 1; i++) {
            int sum = al.get(i) + al.get(i + 1);
            if (sum < minSum) {
                minSum = sum;
                index = i;
            }
        }

        if (index != -1) {
            al.set(index, minSum);
            al.remove(index + 1);
        }
        count++;
        System.out.println(minSum);
        }
        return count;
    }
}
