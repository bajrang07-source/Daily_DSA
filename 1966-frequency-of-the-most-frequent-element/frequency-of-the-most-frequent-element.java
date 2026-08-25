class Solution {
    public int maxFrequency(int[] nums, int k) {

        // ----------------Approach 1-----------------

        // HashMap<Integer, Integer> map = new HashMap<>();

        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > max){
        //         max = nums[i];
        //     }
        // }

        // for(int j=0; j<nums.length; j++){
        //     if(k == 0) break;
        //     if(max != nums[j] && (max - nums[j]) <= k){
        //         k -= max - nums[j];
        //         nums[j] = max; 
        //     }
        // }

        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // int freq = 0;
        // int val = 0;
        // for(int m=0; m<nums.length; m++){
        //     if(map.get(nums[m]) > freq && (nums[m] != val)){
        //         freq = map.get(nums[m]);
        //         val = nums[m];
        //     }
        // }
        // return freq;

        //----------------Approach 2-----------------------
        Arrays.sort(nums);

        int i = 0;
        long sum = 0;
        int freq = 1;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            long cost = (long) nums[j] * (j - i + 1) - sum;
            while (cost > k) {
                sum -= nums[i];
                i++;
                cost = (long) nums[j] * (j - i + 1) - sum;
            }
            freq = Math.max(freq, j - i + 1);
        }
        return freq;
    }
}