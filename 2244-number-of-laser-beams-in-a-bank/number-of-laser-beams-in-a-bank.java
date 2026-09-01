class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int oldCount = 0;
        int ans = 0;
        for(int i = 0; i < bank.length; i++) {
            for(int j = 0; j < bank[i].length(); j++) {
                if(bank[i].charAt(j) == '1') {
                    count++;
                }  
            }
            if(count != 0) {
                ans += oldCount*count;
                oldCount = count;
                count =0;
            }
        }
        return ans;
    }
}