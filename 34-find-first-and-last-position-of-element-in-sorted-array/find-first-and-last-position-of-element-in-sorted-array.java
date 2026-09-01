class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurence = -1;
        int lastOccurence = -1;

        if(nums.length == 0) {
            return new int[]{firstOccurence, lastOccurence};
        }

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < target) {
                low = mid+1;
            } 
            else if(nums[mid] > target) {
                high = mid - 1;
            } 
            else {
                firstOccurence = mid;
                high = mid-1;
            }
        }

        low = 0;
        high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] > target) {
                high = mid - 1;
            } 
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                lastOccurence = mid;
                low = mid + 1;
            }
        }
    
        return new int[]{firstOccurence, lastOccurence};
    }
}