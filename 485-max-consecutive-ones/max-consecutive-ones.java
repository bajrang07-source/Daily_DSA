class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
//------------------       APPROACH 1       ---------------------------------
        int n = nums.length;
        // int count = 0;
        // int ans = 0;
        // for(int i = 0; i < n; i++) {
        //     if(nums[i] == 1) {
        //         for(int j = i; j < n; j++) {
        //             if(nums[j] == 1) {
        //                 ans++;
        //             }else{
        //                 break;
        //             }
        //         }
        //         if(ans > count) {
        //             count = ans;
        //         }
        //         ans = 0;
        //     }
        // }
        // return count;

//--------------------         APPROACH 2         -----------------------------------

        int count = 0;
        int answer = 0;
        int temp = 0;
        for(temp = 0; temp < n; temp++) {
            if(nums[temp] == 1) {
                break;
            }
        }
        int i = temp; int j = i;
        while(j < n) {
            if(nums[j] == 1) {
                j++;
            }
            else{
                if((j-i) > count) {
                    count = j-i;
                }
                i = j + 1;
                j = i;
            }
        }
        if((j-i) > count) {
            count = j-i;
        }

        return count;
    }
}