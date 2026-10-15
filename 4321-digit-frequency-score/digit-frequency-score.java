class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            ans += lastDigit;
            n = n / 10;
        }
        return ans;
    }
}