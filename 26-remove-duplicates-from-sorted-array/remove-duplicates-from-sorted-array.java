class Solution {
    public int removeDuplicates(int[] nums) {
        //---------BRUTE-FORCE APPROACH--------------
        // Set<Integer> set = new TreeSet<>();
        // for(int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // }
        // int i=0;
        // for(int val : set) {
        //     nums[i++] = val;
        // }

        // return set.size();

        //------------OPTIMAL APPROACH-----------------
        int i=0; 
        int j=1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}