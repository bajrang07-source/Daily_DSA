class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

//------------       APPROACH 1       -------------

        // for(int i = 0; i < n; i++) {
        //     if(min > nums[i]) {
        //         min = nums[i];
        //     }
        // }
        // return min;

//------------       APPROACH 2       -------------

        int left = 0;
        int right = n-1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            }
            else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }
}