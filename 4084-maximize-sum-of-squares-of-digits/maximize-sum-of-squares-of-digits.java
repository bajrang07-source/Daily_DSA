class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder s = new StringBuilder();
        int sum1 = sum;
        while(num > 0) {
            if(sum > 9) {
                s.append("9");
                sum -= 9;
                num--;
            }
            else {
                if(sum == 0) {
                    s.append("0");
                    num--;
                    continue;
                }
                s.append(Integer.toString(sum));
                sum -= sum;
                num--;
            }
        }
        String S = s.toString();
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            count += S.charAt(i) - '0';
        }
        if(sum1 == count) {
            return S;
        }
        else {
            return "";
        }
    }
}