class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;
        // int mid = 0;
        int val = 0;
        int idx = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == x) {
                idx = mid;
                break;
            }
            else if(arr[mid] > x) {
                right = mid - 1;
            }
            else {
                val = arr[mid];
                idx = mid;
                left = mid + 1;
            }
        }

        if(x < arr[0]) {
            val = arr[0];
            idx = 0;
        }

        int t1 = idx;
        int t2 = idx+1;
        while(k > 0) {
            if(t1 < 0) {
                list.add(arr[t2]);
                t2++;
            }
            else if(t2 >= arr.length) {
                list.add(arr[t1]);
                t1--;
            }
            else if(Math.abs(arr[t1] - x) < Math.abs(arr[t2] - x)) {
                list.add(arr[t1]);
                t1--;
            }
            else if(Math.abs(arr[t1] - x) > Math.abs(arr[t2] - x)) {
                list.add(arr[t2]);
                t2++;
            }
            else {
                if(arr[t1] < arr[t2]) {
                    list.add(arr[t1]);
                    t1--;
                }
                else {
                    list.add(arr[t2]);
                    t2++;
                }
            }
            k--;
        }

        Collections.sort(list);
        return list;
    }
}