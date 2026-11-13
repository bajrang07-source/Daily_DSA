class Solution {
    public String reverseWords(String s) {
        int n = s.length();

        String[] temp = new String[n];
        int idx = 0;
        String uniWord = "";

        for (int j = 0; j < n; j++) {
            if (s.charAt(j) != ' ') {
                uniWord += s.charAt(j);
            } 
            else {
                if (!uniWord.isEmpty()) {
                    temp[idx++] = uniWord;
                    uniWord = "";
                }
            }
        }

        if (!uniWord.isEmpty()) {
            temp[idx++] = uniWord;
        }

        String ans = "";
        for (int i = idx - 1; i >= 0; i--) {
            ans += temp[i];
            if (i != 0) ans += " ";
        }
        return ans;
    }
}
