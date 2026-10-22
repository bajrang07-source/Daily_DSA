class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        boolean[] check = new boolean[max];
        int idx = 0;
        for(int i = 1; i <= max; i++) {
            if(idx < n && i == arr[idx]) {
                check[i-1] = true;
                idx++;
            }
        }
        int track = 0;
        for(int i = 0; i < max; i++) {
            if(check[i] == false) {
                track++;
            }
            if(track == k) return i+1;
        }
        return max + (k - track);
    }
}