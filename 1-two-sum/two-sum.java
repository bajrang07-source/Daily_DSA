class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

//---------------      APPROACH 1     -----------------
        // for(int i = 0; i < n - 1; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};

//--------------      APPROACH 2      ------------------

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for(int j = 0; j < n; j++) {
            if(map.containsKey(target - nums[j]) && j != map.get(target - nums[j])) {
                return new int[]{map.get(target - nums[j]), j};
            }
        }

        return new int[]{-1, -1};
    }
}