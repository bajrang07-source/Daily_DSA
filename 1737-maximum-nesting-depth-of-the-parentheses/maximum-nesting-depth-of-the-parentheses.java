class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        int temp = 0;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                temp++;
                ans = Math.max(ans, temp);
            }
            else if(s.charAt(i) == ')') {
                temp--;
            }
        }
        if(ans == Integer.MIN_VALUE) return 0;
        else return ans;
    }
}