class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();

        int start = 0;
        int end = 1;
        int left = 0;
        int right = 0;
        String ans = "";

        for(int i = 0; i < n; i++) {
            end = i;

            if(s.charAt(i) == '(') left++;
            else right++;

            if(left == 1) start = i;

            if(left == right) {
                // end = i-1;
                for(int j = start+1; j < end; j++) {
                    ans += s.charAt(j);
                }
                left = 0;
                right = 0;
                start = i;
            }
        }
        return ans;
    }
}