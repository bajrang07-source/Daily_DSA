class Solution {
    public int RtoI(char ch) {
        switch(ch) {
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
            default :
                return -1;
        }
        // return -1;
    }
    public int romanToInt(String s) {
        int n = s.length();
        int intValue = RtoI(s.charAt(n-1));
        for(int i = n-2; i >= 0; i--) {
            int curr = RtoI(s.charAt(i));

            if(curr < RtoI(s.charAt(i+1))) {
                intValue -= curr;
            }
            else {
                intValue += curr;
            }
        }
        return intValue;
    }
}