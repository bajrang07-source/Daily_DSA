class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int incr = 1;
        int decr = 1;
        int ans = 1;

        for(int i = 0; i < n-1; i++) {
            if(nums[i] < nums[i+1]) {
                decr = 1;
                incr++;
            }
            else if(nums[i] > nums[i+1]) {
                incr = 1;
                decr++;
            }
            else {
                decr = 1;
                incr = 1;
                // continue;
            }
            ans = Math.max(ans, Math.max(incr, decr));
        }
        
        return ans;
    }
}