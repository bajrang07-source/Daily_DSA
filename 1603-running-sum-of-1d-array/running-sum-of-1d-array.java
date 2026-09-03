class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];

        int temp = 0;
        for(int i = 0; i < prefix.length; i++) {
            temp += nums[i];
            prefix[i] = temp;
        }

        return prefix;
    }
}