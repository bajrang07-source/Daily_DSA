class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs.length;

        if(n == 1) return strs[0];

        String temp = strs[0];
        for(int i = 1; i < n; i++) {
            String temp2 = strs[i];
            String equalPart = "";

            int len1 = temp.length();
            int len2 = temp2.length();

            if(len1 <= len2) {
                for(int j = 0; j < len1; j++) {
                    if(temp.charAt(j) == temp2.charAt(j)) {
                        equalPart += temp.charAt(j);
                    }
                    else break;
                }
            }
            else {
                for(int j = 0; j < len2; j++) {
                    if(temp.charAt(j) == temp2.charAt(j)) {
                        equalPart += temp.charAt(j);
                    }
                    else break;
                }
            }
            ans = equalPart;
            temp = equalPart;
        }
        return ans;
    }
}