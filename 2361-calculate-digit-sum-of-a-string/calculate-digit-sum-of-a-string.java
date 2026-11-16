class Solution {
    public String digitSum(String s, int k) {
        String str = s;
        int n = str.length();

        while(str.length() > k) {
            String sumCnt = "";
            int count = (str.length() + k - 1) / k;
    
            int start = 0;
            int end = k;
            for(int i = 0; i < count; i++) {
                String strPart = "";
                if(i == count-1) {
                    strPart = str.substring(start);
                }
                else {
                    strPart = str.substring(start, end);
                }

                int sum = 0;
                for(int j = 0; j < strPart.length(); j++) {
                    sum += strPart.charAt(j) - '0';
                }
                sumCnt += sum;
                start += k;
                end += k;
            }
            str = sumCnt;
        }
        return str;
    }
}