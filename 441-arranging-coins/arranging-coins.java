class Solution {
    public int arrangeCoins(int n) {
        int ans = 0;
        int coins = n;

        for(int i = 1; i <= n; i++) {
            if(coins - i < 0) {
                break;
            }
            coins -= i;
            ans++;
        }
        return ans;
    }
}