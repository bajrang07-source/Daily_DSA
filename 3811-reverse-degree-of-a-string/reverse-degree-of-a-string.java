class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int IndexofRevAlpha = 26;
        for(char c = 'a'; c <= 'z'; c++) {
            map.put(c, IndexofRevAlpha--);
        }

        int ans = 0;

        for(int i = 0; i < s.length(); i++) {
            ans += map.get(s.charAt(i)) * (i+1);
        }

        return ans;
    }
}