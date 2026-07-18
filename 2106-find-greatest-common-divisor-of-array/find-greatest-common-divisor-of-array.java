class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];
        for(int i=smallest; i>0; i--){
            if(smallest % i == 0 && largest % i == 0){
                return i;
            }
        }
        return 1;
    }
}