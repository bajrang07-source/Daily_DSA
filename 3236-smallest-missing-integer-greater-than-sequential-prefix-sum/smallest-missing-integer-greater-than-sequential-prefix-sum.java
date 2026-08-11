class Solution {
    public int missingInteger(int[] nums) {
        int i=0; 
        int j=1;
        int sum=nums[0];
        while(j<nums.length){
            if(nums[j]-nums[j-1] == 1){
                sum+=nums[j];
                j++;
            }else{
                break;
            }
        }
        // for(int val=i; val<nums.length; val++){
        //     if(nums[val] == sum){
        //         sum++;
        //         val = -1;
        //     }
        // }

        HashSet<Integer> hs = new HashSet<>();
        for(int val=0; val<nums.length; val++){
            hs.add(nums[val]);
        }
        while(hs.contains(sum)){
            sum++;
        }
        return sum;
    }
}