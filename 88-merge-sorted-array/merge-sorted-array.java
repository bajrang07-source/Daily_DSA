class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//------      APPROACH 1     --------

        // int idx = 0;
        // for(int i = m; i < m+n; i++) {
        //     nums1[i] = nums2[idx++];
        // }
        // Arrays.sort(nums1);

//------      APPROACH 2     --------

        int i = 0;
        int j = 0;
        int[] temp = new int[m+n];
        int idx = 0;
        while(i < m && j < n) {
            if(nums1[i] > nums2[j]) {
                temp[idx++] = nums2[j++];
            }
            else {
                temp[idx++] = nums1[i++];
            }
        }

        while(i < m) {
            temp[idx++] = nums1[i++];
        }
        while(j < n) {
            temp[idx++] = nums2[j++];
        }

        for(int k = 0; k < m+n; k++) {
            nums1[k] = temp[k];
        }
    }
}