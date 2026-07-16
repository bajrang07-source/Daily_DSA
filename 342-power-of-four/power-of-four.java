class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }else if(n<=0){
            return false;
        }else{
        int high = 15;
        int low = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            int result =(int) Math.pow(4, mid);
            if(result>n){
                high = mid-1;
            }else if(result<n){
                low = mid +1;
            }else{
                return true;
            }
        }
        return false;
        }
    }
}