class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int dup = x;
        int reversed = 0;

        while(x > 0){
            int lastDigit = x % 10;
            x /= 10;
            reversed = reversed * 10 + lastDigit;
        }

        if(reversed == dup) return true;
        else return false;
    }
}