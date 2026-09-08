class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int flag = 0;
            for(int j = 0; j < n; j++) {
                if(nums[i] == nums[j] && i != j) {
                    flag = 1;
                }
            }
            if(flag == 0) return nums[i];
        }
        return -1;
    }
}