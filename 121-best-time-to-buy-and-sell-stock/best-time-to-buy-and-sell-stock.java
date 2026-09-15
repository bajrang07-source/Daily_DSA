class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = Integer.MIN_VALUE;

//------------      APPROACH 1      ----------------
        // for(int i = 0; i < n - 1; i++) {
        //     int val = prices[i];
        //     for(int j = i + 1; j < n; j++) {
        //         ans = Math.max(ans, (prices[j] - val));
        //     }
        // }
        // if(ans < 0) return 0;
        // else return ans;

//------------      APPROACH 2      ----------------

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            min = Math.min(min, prices[i]);

            ans = Math.max(ans, prices[i] - min);
        }
        if(ans < 0) return 0;
        else return ans;
    }
}