class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> possible = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(possible.containsKey(nums[i]))
            {
                sol[0] = i;
                sol[1] = possible.get(nums[i]);
                break;
            }
            possible.put(target-nums[i], i);
        }
        return sol;
    }
}
