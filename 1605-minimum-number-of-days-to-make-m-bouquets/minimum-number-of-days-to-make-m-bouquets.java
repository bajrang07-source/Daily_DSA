class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if((long)m * k > n) return -1;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(max < bloomDay[i]) {
                max = bloomDay[i];
            }
        }

        int left = 1;
        int right = max;
        int minDay = 0;

        while(left <= right) {
            int mid = (left + right) / 2;

            int Bouquets = 0;
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(bloomDay[i] <= mid) {
                    count++;
                    if(count == k) {
                        Bouquets++;
                        count = 0;
                    }
                }
                else {
                    count = 0;
                }
                if(Bouquets > m) break;
            }

            if(Bouquets < m) {
                left = mid + 1;
            }
            else {
                minDay = mid;
                right = mid - 1;
            }
        }
        return minDay;
    }
}