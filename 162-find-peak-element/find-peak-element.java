class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

//-----------       APPROACH 1       -------------
        // if(n == 2) {
        //     int ans = Math.max(nums[0], nums[1]);
        //     return ans;
        // }

        // for(int i = 1; i < n-1; i++) {
        //     if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
        //         return i;
        //     }
        // }
        // return 0;

//-----------       APPROACH 2       -------------

        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                // Moving towards the rising slope
                left = mid + 1;
            } else {
                // Peak is at mid or in the left half
                right = mid;
            }
        }
        
        return left;
    }
}