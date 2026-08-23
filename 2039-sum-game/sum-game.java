class Solution {
    public boolean sumGame(String num) {
        int left = 0;
        int right = 0;
        int Lsum = 0;
        int Rsum = 0;
        
        for(int i=0; i<num.length(); i++){
            if(num.length()/2 > i){
                if(num.charAt(i) == '?'){
                    left++;
                }else{
                    Lsum += num.charAt(i) - '0';
                }  
            }else{
                if(num.charAt(i) == '?'){
                    right++;
                }else{
                    Rsum += num.charAt(i) - '0';
                }
            }
        }

        int sumDiff = Lsum - Rsum;
        int qDiff   = left - right;

        return 2 * sumDiff != -9 * qDiff;

    }
}