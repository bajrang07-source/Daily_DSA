class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sumOfSquare = 0;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                arr[i] = -1 * nums[i];
            }
            else {
                arr[i] = nums[i];
            }
        }
        Arrays.sort(arr);

        for(int i = 0; i < n/2; i++) {
            sumOfSquare -= (arr[i] * arr[i]);
        }
        for(int i = n/2; i < n; i++) {
            sumOfSquare += (arr[i] * arr[i]);
        }
        return sumOfSquare;
    }
}