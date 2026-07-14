class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int x1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int x2 = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = x1 + x2 + carry;
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        String ans1 = (ans.reverse()).toString();
        return ans1;
    }
}