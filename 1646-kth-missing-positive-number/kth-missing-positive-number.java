class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

//-------       APPROACH 1      --------

        // boolean[] check = new boolean[max];
        // int idx = 0;
        // for(int i = 1; i <= max; i++) {
        //     if(idx < n && i == arr[idx]) {
        //         check[i-1] = true;
        //         idx++;
        //     }
        // }
        // int track = 0;
        // for(int i = 0; i < max; i++) {
        //     if(check[i] == false) {
        //         track++;
        //     }
        //     if(track == k) return i+1;
        // }
        // return max + (k - track);

//-------       APPROACH 1      --------

        for(int i = 0; i < n; i++) {
            if(arr[i] <= k) k++;
            else break;
        }
        return k;

//-------       APPROACH 3      --------

        // int left = 0;
        // int right = n - 1;

        // while (left <= right) {
        //     int mid = left + (right - left) / 2;

        //     int missing = arr[mid] - (mid + 1);

        //     if (missing < k) {
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }

        // return left + k;
    }
}