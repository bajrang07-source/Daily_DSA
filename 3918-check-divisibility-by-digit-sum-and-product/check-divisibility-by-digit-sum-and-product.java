class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int multi = 1;
        int num = n;
        while(num > 0){
            int val = num % 10;
            sum += val;
            multi *= val;
            num = num/10;
        }

        return (n%(sum + multi)) == 0;
    }
}