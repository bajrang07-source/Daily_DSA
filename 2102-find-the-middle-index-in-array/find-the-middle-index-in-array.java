class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        int temp = 0;
        int last = prefixSum.length - 1;
        for(int j = 0; j < n; j++) {
            if(temp == prefixSum[last] - prefixSum[j]) {
                return j;
            }
            temp = prefixSum[j];
        }

        return -1;
    }
}