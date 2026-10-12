class Solution {
    public int merge(int[] arr, int left, int mid, int right) {

        int count = 0;
        int val = mid+1;
        for (int i = left; i <= mid; i++) {
            while (val <= right && (long) arr[i] > 2L * arr[val]) {
                val++;
            }
            count += (val - (mid + 1));
        }

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while(i < n1 && j < n2) {
            if(L[i] > R[j]) {
                // if(L[i] > 2 * R[j]) {
                //     count += n1 - i;
                // }
                arr[k] = R[j];
                j++;
            }
            else {
                arr[k] = L[i];
                i++;
            }
            k++;
        }
        while(i < n1) {
            arr[k++] = L[i++];
        }
        while(j < n2) {
            arr[k++] = R[j++];
        }
        return count;
    }

    public int mergeSort(int[] arr, int left, int right) {
        if(left >= right) return 0;

        int mid = (left + right) / 2;
        int count = mergeSort(arr, left, mid);
        count += mergeSort(arr, mid+1, right);

        count += merge(arr, left, mid, right);
        return count;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        int ans = 0;

//-----------        APPROACH 1        ------------------

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if ((long) nums[i] > 2L * nums[j]) {
        //             ans++;
        //         }
        //     }
        // }
        // return ans;

//-----------        APPROACH 1        ------------------

        int left = 0;
        int right = n-1;
        int count = mergeSort(nums, left, right);
        return count;
    }
}