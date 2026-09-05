class Solution {
    public int trap(int[] height) {

        //----------------APPROACH - 1 ----------------------------------

        // int n = height.length;
        // int max1 = Integer.MIN_VALUE;
        // int max2 = Integer.MIN_VALUE;
        // int ans = 0;

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         max1 = Math.max(max1, height[j]);
        //     }

        //     for(int k = i; k < n; k++) {
        //         max2 = Math.max(max2, height[k]);
        //     }

        //     ans += (Math.min(max1, max2) - height[i]);
        //     max1 = Integer.MIN_VALUE;
        //     max2 = Integer.MIN_VALUE;
        // }

        // return ans;

//--------------------------APPROACH-2----------------------------------------

    int n = height.length;
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;

    int[] prefixMax1 = new int[n];
    prefixMax1[0] = height[0];
    for(int i = 1; i < n; i++) {
        prefixMax1[i] = Math.max(prefixMax1[i-1], height[i]);
    }

    int[] prefixMax2 = new int[n];
    prefixMax2[n-1] = height[n-1];
    for(int j = n-2; j >= 0; j--) {
        prefixMax2[j] = Math.max(prefixMax2[j+1], height[j]);
    }

    int ans = 0;
    for(int k = 0; k < n; k++) {
        ans += Math.min(prefixMax1[k], prefixMax2[k]) - height[k];
    }
    return ans;
    }
}