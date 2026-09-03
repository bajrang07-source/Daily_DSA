class Solution {
    public boolean uniformArray(int[] nums1) {
        //------------------Optimal and correct Approach------------------------
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 == 0) {
                minEven = Math.min(minEven, nums1[i]);
            }
            else {
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }
        if(minEven == Integer.MAX_VALUE || minOdd == Integer.MAX_VALUE) return true;
        if(minEven > minOdd) return true;
        if(minEven < minOdd) return false;
        return false;


        //--------------------Approach 1---------------------
        // int check = 0; 
        // check = nums1[0];
        // int[] nums2 = new int[nums1.length];
        // if(check % 2 == 0) {
        //     for(int i = 1; i < nums1.length; i++) {
        //         if(nums1[i] % 2 == 0) {
        //             continue;
        //         } 
        //         else if((nums1[i] - nums1[i-1]) % 2 == 0 && (nums1[i] - nums1[i-1]) > 0) {
        //             continue;
        //         }
        //         else {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        // else {
        //     for(int i = 1; i < nums1.length; i++) {
        //         if(nums1[i] % 2 != 0) {
        //             continue;
        //         } 
        //         else if((nums1[i] - nums1[i-1]) % 2 != 0 && (nums1[i] - nums1[i-1]) > 0) {
        //             continue;
        //         }
        //         else {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
    }
}