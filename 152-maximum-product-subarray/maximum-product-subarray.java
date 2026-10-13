class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

//-------------        APPROACH 1        ---------------

        // int largestProduct = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++) {
        //     int product = nums[i];
        //     for(int j = i+1; j < n; j++) {
        //         product *= nums[j];
        //         largestProduct = Math.max(largestProduct, product);
        //     }
        // }
        // return largestProduct;

//-------------        APPROACH 2        ---------------

        int maxi = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i = 0; i < n; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }
}