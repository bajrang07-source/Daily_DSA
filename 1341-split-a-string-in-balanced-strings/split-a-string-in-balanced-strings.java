class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int split = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'R') ans++;
            else ans--;
            if(ans == 0){
                split++;
            }
        }
        return split;
    }
}