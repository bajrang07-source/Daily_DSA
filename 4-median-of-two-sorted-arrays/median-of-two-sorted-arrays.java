class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

//-----------      APPROACH 1       --------------
        // int[] arr = new int[n + m];

        // int idx = 0;
        // for(int i = 0; i < n; i++) {
        //     arr[idx++] = nums1[i];
        // }
        // for(int j = 0; j < m; j++) {
        //     arr[idx++] = nums2[j];
        // }

        // Arrays.sort(arr);

        // if(arr.length % 2 == 0) {
        //     int idx2 = arr.length / 2;

        //     double ans = (arr[idx2] + arr[idx2-1]) / 2.0;

        //     return ans;
        // } 
        // else {
        //     return arr[arr.length / 2];
        // }

//-----------      APPROACH 2       --------------

        int val1 = 0;
        int val2 = 0;
        int i = 0;
        int j = 0;

        int idx2 = (n + m) / 2;
        int cnt = 0;

        while (cnt <= idx2) {
            val1 = val2;

            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                val2 = nums1[i++];
            } else {
                val2 = nums2[j++];
            }

            cnt++;
        }
        
        if((n + m) % 2 == 0) {
            return ((double) val1 + val2) / 2.0;
        }
        else {
            return val2;
        }
    }
}