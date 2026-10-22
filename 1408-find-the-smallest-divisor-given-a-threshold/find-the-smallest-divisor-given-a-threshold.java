class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }

        int left = 1;
        int right = max;
        int minDivisor = 0;
        while(left <= right) {
            int mid = (left + right) / 2;

            int divSum = 0;
            for(int i = 0; i < n; i++) {
                divSum += Math.ceil((double)nums[i] / mid);

                if(divSum > threshold) break;
            }

            if(divSum <= threshold) {
                minDivisor = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return minDivisor;
    }
}