class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int ngtvIdx = 1;
        int pstvIdx = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                ans[ngtvIdx] = nums[i];
                ngtvIdx += 2;
            }
            else{
                ans[pstvIdx] = nums[i];
                pstvIdx += 2;
            }
        }
        return ans;
    }
}