class Solution {
    public int reverse(int x) {
        int n = x;
        long reversed = 0;
        long mul = 1;
        if(n < 0){
            mul = -1;
            n *= -1;
        }
        while(n > 0){
            int lastDigit = n % 10;
            n /= 10;
            reversed = reversed * 10 + lastDigit;
        }
        if(mul * reversed > 2147483647 || mul * reversed < -2147483647) return 0;
        return (int) mul * (int) reversed;
    }
}