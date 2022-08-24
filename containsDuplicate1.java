class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++ ) {
            int currNum = nums[i];
            if (uniqueNums.contains(currNum) ) return true;
            uniqueNums.add(currNum);
        }
        return false;
    }
}