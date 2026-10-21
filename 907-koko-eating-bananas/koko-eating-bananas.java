class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(max < piles[i]) {
                max = piles[i];
            }
            if(min > piles[i]) {
                min = piles[i];
            }
        }

//----------       APPROACH 1       --------------

        // // int minEat = 0;
        // // int idx = 0;

        // for(int i = 1; i <= max; i++) {
        //     int minEat = 0;
        //     for(int j = 0; j < n; j++) {
        //         int num = piles[j];
        //         minEat += Math.ceil((double)num / i);
        //         if(minEat > h) break;
        //     }
        //     if(minEat <= h) return i;
        // }
        // return -1;

//----------       APPROACH 2       --------------

        int left = 1;
        int right = max;
        int ans = 0;

        while(left <= right) {
            int mid = (left + right) / 2;

            int minEat = 0;
            for(int i = 0; i < n; i++) {
                minEat += Math.ceil((double)piles[i] / mid);
                if(minEat > h) break;
            }

            if(minEat > h) {
                left = mid + 1;
            }
            else if(minEat <= h) {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
}