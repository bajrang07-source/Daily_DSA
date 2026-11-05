class Solution {
    public int findNearest(int[] arr, int num) {
        int n = arr.length;

        int left = 0;
        int right = n-1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] < num) {
                left = mid+1;
            }
            else if(arr[mid] > num) {
                right = mid-1;
            }
            else {
                return arr[mid];
            }
        }
        if (left >= arr.length) {
            return arr[right];
        }

        if (right < 0) {
            return arr[left];
        }

        if(Math.abs(num - arr[right]) <= Math.abs(num - arr[left])) {
            return arr[right];
        }
        return arr[left];
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m = arr2.length;

        int ans = 0;

//--------          APPROACH 1         -----------

        // for(int i = 0; i < n; i++) {
        //     boolean flag = false;
        //     for(int j = 0; j < m; j++) {
        //         if(Math.abs(arr1[i] - arr2[j]) > d) {
        //             flag = true;
        //         }
        //         else {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag) {
        //         ans++;
        //     }
        // }
        // return ans;

//--------          APPROACH 2         -----------

        Arrays.sort(arr2);
        // int ans = 0;
        for(int i = 0; i < n; i++) {
            int nearest = findNearest(arr2, arr1[i]);
            if(Math.abs(arr1[i] - nearest) > d) {
                ans++;
            }
        }
        return ans;
    }
}