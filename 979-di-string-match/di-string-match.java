class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int m = 0;
        int[] ans = new int[s.length()+1];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                ans[i] = m++;
            }else{
                ans[i] = n--;
            }
        }
        ans[ans.length-1] = n;
        return ans;
    }
}