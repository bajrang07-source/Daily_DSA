class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int open = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(open>0){
                    ans = ans + s.charAt(i);
                }
                open++;
            }
            else{
                if(open>1){
                    ans = ans + s.charAt(i);
                }
                open--;
            }
        }
        return ans;
    }
}