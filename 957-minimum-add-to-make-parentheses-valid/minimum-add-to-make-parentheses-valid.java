class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int ans = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                ans += 1;
            }
            else {
                if(!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                    ans -= 1;
                }
                else {
                    ans += 1;
                }
            }
        }
        return Math.abs(ans);
    }
}