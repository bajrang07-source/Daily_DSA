class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> S = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                S.push(s.charAt(i));
            }
            else {
                if(S.empty()) return false;
                else if(s.charAt(i) == ')') {
                    if(S.peek() == '(') {
                        S.pop();
                    } else return false;
                }
                else if(s.charAt(i) == ']') {
                    if(S.peek() == '[') {
                        S.pop();
                    } else return false;
                }
                else if(s.charAt(i) == '}') {
                    if(S.peek() == '{') {
                        S.pop();
                    } else return false;
                }
            }
        }
        return S.empty();
    }
}