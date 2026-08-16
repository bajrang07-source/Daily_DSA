class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p_idx = 0;
        int n_idx = 1;
        // HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                // map.put(p_idx, nums[i]);
                ans[p_idx] = nums[i];
                p_idx += 2;
            }else{
                // map.put(n_idx, nums[i]);
                ans[n_idx] = nums[i];
                n_idx += 2;
            }
        }
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     ans[entry.getKey()] = entry.getValue();
        // }
        return ans;
    }
}