class Solution {

    public int find_pivot(int[] arr, int low, int high) {

        int pivot = arr[low];
        int left = low;
        int right = high;
        while(left < right) {
            while(left <= high && arr[left] <= pivot) {
                left++;
            }
            while(right >= low && arr[right] > pivot) {
                right--;
            }
            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // Put pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;
        return right;
    }

    public void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = find_pivot(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public boolean check(int[] nums) {
        int[] sortedArray = nums.clone();
        quickSort(sortedArray, 0, sortedArray.length - 1);
        int n = nums.length;
        for(int x = 0; x < n; x++) {
            boolean valid = true;
            for(int j = 0; j < n; j++) {
                if(nums[j] != sortedArray[(j + x) % n]) {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                return true;
            }
        }
        return false;
    }
}