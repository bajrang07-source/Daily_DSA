class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int left = 1;
        int right = n-2;

        if(n == 1) return nums[0];
        if(nums[left] != nums[0]) return nums[0];
        if(nums[right] != nums[n-1]) return nums[n-1];

        while(left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == nums[mid - 1]) {
                if(mid % 2 == 0) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else if(nums[mid] == nums[mid + 1]) {
                if(mid % 2 == 0) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else {
                return nums[mid];
            }
        }
        return -1;
    }
}