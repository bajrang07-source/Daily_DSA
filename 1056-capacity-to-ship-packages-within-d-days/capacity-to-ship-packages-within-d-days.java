class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }

        int left = max;
        int right = sum;
        int capacity = 0;
        while(left <= right) {
            int mid = (left + right) / 2;

            int reqDay = 1;
            int temp = 0;
            // int idx = 0;
            for(int i = 0; i < n; i++) {
                if(reqDay > days) break;
                if((temp + weights[i]) <= mid) {
                    temp += weights[i];
                }
                else {
                    reqDay++;
                    temp = 0;
                    i--;
                }
            }

            if(reqDay > days) {
                left = mid+1;
            }
            else {
                capacity = mid;
                right = mid-1;
            }
        }
        return capacity;
    }
}