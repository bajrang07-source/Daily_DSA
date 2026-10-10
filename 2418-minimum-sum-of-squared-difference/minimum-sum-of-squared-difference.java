class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

//----------          APPROACH 1           -------------------

        // int n = nums1.length;
        // int m = nums2.length;
        // int k = k1 + k2;
        // int ans = 0;

        // int[] absDiff = new int[n];
        // for(int i = 0; i < n; i++) {
        //     absDiff[i] = Math.abs(nums1[i] - nums2[i]);
        // }

        // int sum = 0;
        // for(int l = 0; l < n; l++) {
        //     sum += absDiff[l];
        // }

        // for (int i = 0; i < k; i++) {
        //     Arrays.sort(absDiff);
        //     int j = n - 1;
        //     if (absDiff[j] == 0) {
        //         break;
        //     }
        //     absDiff[j]--;
        // }

        // if(k >= sum) return 0;

        // for(int i = 0; i < n; i++) {
        //     ans += (long) absDiff[i] * absDiff[i];
        // }

        // return ans;

//-----------       APPROACH 2      ---------------

        int n = nums1.length;
        int k = k1 + k2;

        int[] diff = new int[n];
        long sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
            max = Math.max(max, diff[i]);
        }

        if (k >= sum) return 0;
        int[] freq = new int[max + 1];

        for (int d : diff) {
            freq[d]++;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            int reduce = Math.min(freq[d], k);
            freq[d] -= reduce;
            freq[d - 1] += reduce;
            k -= reduce;
        }

        long ans = 0;
        for (int d = 1; d <= max; d++) {
            ans += (long) d * d * freq[d];
        }
        return ans;
    }
}