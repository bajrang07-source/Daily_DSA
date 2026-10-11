class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;

        int idx = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                ans += (nums[idx] * nums[idx]);
            }
            idx++;
        }
        return ans;
    }
}