class Solution {
    public void moveZeroes(int[] nums) {

//-------------------      BRUTE FORCE APPROACH       -------------------------------
        // int[] temp = new int[nums.length];
        // int noOfZeros = 0;
        // int idx = 0;

        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] == 0) noOfZeros++;
        //     else{
        //         temp[idx++] = nums[i];
        //     }
        // }

        // for(int j = 0; j < noOfZeros; j++) {
        //     temp[idx++] = 0;
        // }

        // for(int k = 0; k < nums.length; k++) {
        //     nums[k] = temp[k];
        // }

//-------------------      OPTIMAL APPROACH       -------------------------------

        int i = -1;
        int j = -1;
        for(int idx = 0; idx < nums.length; idx++) {

            if(nums[idx] == 0) {
                j = idx;
                i = idx + 1;
                break;
            }
        }

        if(j == -1) return;

        while(i < nums.length) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i = j + 1;
            }
            else{
                i++;
            }
        }
    }
}