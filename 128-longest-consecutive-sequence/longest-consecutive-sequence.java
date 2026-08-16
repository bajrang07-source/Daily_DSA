class Solution {
    public int longestConsecutive(int[] nums) {

        //---Initial Approach----

        // if(nums.length<1) return 0;
        // Arrays.sort(nums);
        // int count = 1;
        // int ans = 0;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] - nums[i-1] == 1){
        //         count++;
        //     }
        //     else if(nums[i] == nums[i-1]){
        //         continue;
        //     }else{
        //         ans = Math.max(ans, count);
        //         count=1;
        //     }
        // }
        // return Math.max(ans, count);

        //Approach considering TC:-
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = 0;
        for(int val : set){
            if(!set.contains(val-1)){
                int count = 1;
                int c_val = val;

                while(set.contains(c_val+1)){
                    count++;
                    c_val++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}