class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        // int i = 0;
        // int j = 1;

        for(int i = 0; i < n - 1; i++) {
            int j = i+1;

            while(j > 0 && nums[j-1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
    }
}