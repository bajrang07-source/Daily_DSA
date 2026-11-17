class Solution {
    public int maxDepth(String s) {
        int n = s.length();

        int ans = 0;
        int leftCnt = 0;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                leftCnt++;
                ans = Math.max(ans, leftCnt);
            }
            else if(s.charAt(i) == ')') {
                leftCnt--;
            }
        }
        return ans;
    }
}