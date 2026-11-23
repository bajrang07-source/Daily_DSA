class Solution {
    public int myAtoi(String s) {
        int n = s.length();

        int sign = 1;
        long intValue = 0;
        boolean flag = false;
        boolean signProcessed = false;

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if(!flag && !signProcessed && ch == ' ') {
                continue;
            }

            if(!flag && !signProcessed && ch == '-') {
                sign = -1;
                signProcessed = true;
                continue;
            }
            else if(!flag && !signProcessed && ch == '+') {
                sign = 1;
                signProcessed = true;
                continue;
            }

            if(!Character.isDigit(ch)) {
                return sign * (int)intValue;
            }

            if(Character.isDigit(ch)) {
                int digit = ch - '0';

                if(intValue > Integer.MAX_VALUE / 10 ||
                   (intValue == Integer.MAX_VALUE / 10 &&
                    digit > (sign == 1 ? 7 : 8))) {

                    return sign == 1
                           ? Integer.MAX_VALUE
                           : Integer.MIN_VALUE;
                }

                intValue = intValue * 10 + digit;
                flag = true;
            }
        }
        return sign * (int) intValue;
    }
}
