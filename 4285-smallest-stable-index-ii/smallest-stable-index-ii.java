class Solution {
    public int firstStableIndex(int[] nums, int val) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] prefMax = new int[n];
        int[] prefMin = new int[n];

        prefMax[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefMax[i] = Math.max(prefMax[i-1], nums[i]);
        }

        prefMin[n-1] = nums[n-1];
        for(int j = n-2; j >= 0; j--) {
            prefMin[j] = Math.min(prefMin[j+1], nums[j]);
        }

        for(int temp = 0; temp < n; temp++) {
        if((prefMax[temp] - prefMin[temp]) <= val) {
            return temp;
        }
        }

        return -1;
    }
}