class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int noOfZeros = 0;
        int idx = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) noOfZeros++;
            else{
                temp[idx++] = nums[i];
            }
        }

        for(int j = 0; j < noOfZeros; j++) {
            temp[idx++] = 0;
        }

        for(int k = 0; k < nums.length; k++) {
            nums[k] = temp[k];
        }
    }
}