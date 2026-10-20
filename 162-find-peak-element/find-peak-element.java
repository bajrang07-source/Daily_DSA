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

        // int left = 0;
        // int right = nums.length - 1;
        
        // while (left < right) {
        //     int mid = left + (right - left) / 2;
            
        //     if (nums[mid] < nums[mid + 1]) {
        //         left = mid + 1;
        //     } else {
        //         right = mid;
        //     }
        // }
        
        // return left;

//-----------       APPROACH 2       -------------

        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        int left = 1;
        int right = n-2;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) {
                left = mid + 1;
            }
            else if(nums[mid] < nums[mid - 1] && nums[mid] > nums[mid+1]) {
                right = mid - 1;
            }
            else if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]) {
                left = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}