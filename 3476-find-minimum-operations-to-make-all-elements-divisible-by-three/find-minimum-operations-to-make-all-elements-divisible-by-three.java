class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int noOfOps = 0;

        for(int i = 0; i < n; i++) {
            noOfOps += Math.min(nums[i] % 3, 3 - (nums[i] % 3));
        }
        return noOfOps;
    }
}