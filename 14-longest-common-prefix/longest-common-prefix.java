class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        String temp = "";
        for(int i=1; i<strs.length; i++){
            temp = strs[i];
            int j=0;
            while(j<ans.length() && j<temp.length()){
                if(ans.charAt(j) == temp.charAt(j)){
                    j++;
                    continue;
                }else{
                    ans = ans.substring(0, j);
                    if(j==0){
                        String ans1 = "";
                        return ans1;
                    }
                    break;  
                }
            }
            ans = ans.substring(0, j);
        }
        return ans;
    }
}
