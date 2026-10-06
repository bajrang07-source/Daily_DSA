class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int ans = 0;

        int i = 0;
        int j = i+1;
        while(j < n) {
            int ch1 = s.charAt(i);
            int ch2 = s.charAt(j);
            ans += Math.abs(ch1 - ch2);
            i++;
            j = i+1;
        }
        return ans;
    }
}