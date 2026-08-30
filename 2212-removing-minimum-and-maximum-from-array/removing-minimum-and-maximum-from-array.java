class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
            if(nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
        }
        int left = Math.max(minIdx, maxIdx) + 1;
        int right = n - Math.min(minIdx, maxIdx);

        int both = Math.min(minIdx, maxIdx) + 1
                 + n - Math.max(minIdx, maxIdx);

        return Math.min(left, Math.min(right, both));
    }
}