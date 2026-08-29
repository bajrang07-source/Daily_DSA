class Solution {
    public void rotate(int[] nums, int m) {
        if(nums.length < 2) return;
        m = m % nums.length;
        int i = 0;
        int j = nums.length - 1 - m;
        int k = j + 1;
        int l = nums.length - 1;

        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
        while(k < l) {
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
            k++;
            l--;
        }

        i = 0;
        j = nums.length - 1;

        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}