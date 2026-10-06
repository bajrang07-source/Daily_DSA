class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        
        int i = 0; 
        int j = ans.length - 1;

        for(int k = 0; k < n; k++) {
            ans[i] = nums[i];
            ans[j] = nums[i];
            i++;
            j--;
        }
        return ans;
    }
}