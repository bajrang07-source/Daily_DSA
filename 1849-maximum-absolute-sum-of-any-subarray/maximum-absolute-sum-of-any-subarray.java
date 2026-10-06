class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int ans1 = Integer.MIN_VALUE;
        int ans2 = Integer.MIN_VALUE;

//---------------       APPROACH 1       ---------------

        // for(int i = 0; i < n; i++) {
        //     int sum = nums[i];
        //     ans = Math.max(ans, Math.abs(sum));
        //     for(int j = i+1; j < n; j++) {
        //         sum += nums[j];
        //         ans = Math.max(ans, Math.abs(sum));
        //     }
        // }
        // return Math.abs(ans);

//--------------       APPROACH 2        ---------------

        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += nums[i];
            sum2 += nums[i];
            ans1 = Math.max(ans1, sum1);
            ans2 = Math.max(ans2, Math.abs(sum2));

            if(sum1 < 0) {
                sum1 = 0;
            }
            if(sum2 > 0) {
                sum2 = 0;
            }
        }
        return Math.max(ans1, ans2);
    }
}