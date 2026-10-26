class Solution {
    public boolean canWeSplit(int[] arr, int sum, int count) {
        int splitCnt = 1;
        int total = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(total + arr[i] <= sum) {
                total += arr[i];
            }
            else {
                splitCnt++;
                total = arr[i];
            }
            if(splitCnt > count) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int left = Integer.MIN_VALUE;
        int right = 0;
        for(int i = 0; i < n; i++) {
            left = Math.max(left, nums[i]);
            right += nums[i];
        }

        while(left <= right) {
            int mid = (left + right) / 2;

            if(canWeSplit(nums, mid, k)) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }
}