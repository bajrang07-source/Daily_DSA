class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

//--------------      APPROACH 1      -----------------
        // if(n < 2) return nums[0];
        // int count = 1;

        // for(int i = 0; i < n - 1; i++) {
        //     count = 1;
        //     for(int j = i + 1; j < n; j++) {
        //         if(nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if(count > n/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;

//--------------      APPROACH 2      -----------------

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int j = 0; j < n; j++) {
            if(map.get(nums[j]) > n/2) return nums[j];
        }
        return -1;
    }
}