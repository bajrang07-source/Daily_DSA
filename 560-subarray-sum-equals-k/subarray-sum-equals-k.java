class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

//------------          APPROACH 1          ---------------

        // for(int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for(int j = i; j < n; j++) {
        //         sum += nums[j];
        //         if(sum == k) {
        //             ans++;
        //         }
        //     }
        // }
        // return ans;

//-----------------            APPROACH 2          ----------------

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int Psum = 0;

        for(int i = 0; i < n; i++) {
            Psum += nums[i];
            if(map.containsKey(Psum - k)) {
                ans += map.get(Psum - k);
            }
            map.put(Psum, map.getOrDefault(Psum, 0) + 1);
        }
        return ans;
    }
}