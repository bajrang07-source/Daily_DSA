class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;

//-------------      APPROACH 1      -------------------------
        
        // for(int i = 0; i < n; i++) {
        //     for(int j = i; j < n; j++) {
        //         int sum = 0;
        //         for(int k = i; k <= j; k++) {
        //             sum += nums[k];
        //         }
        //         ans = Math.max(ans, sum);
        //     }
        // }
        // return ans;

//--------------      APPROACH 2      ----------------------

        // for(int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for(int j = i; j < n; j++) {
        //         sum += nums[j];
        //         ans = Math.max(ans, sum);
        //     }
        // }
        // return ans;

//--------------      APPROACH 3      ----------------------

        int sum = 0;

        for(int i = 0; i < n; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}