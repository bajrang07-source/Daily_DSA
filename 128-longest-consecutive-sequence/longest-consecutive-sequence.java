class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n < 1) return 0;
        int ans = 0;
        
//------------      APPROACH 1      ---------------
        // for(int i = 0; i < n; i++) {
        //     int val = nums[i];
        //     int temp = 1;
        //     for(int j = 0; j < n; j++) {
        //         if(nums[j] == val+1) {
        //             val++;
        //             temp++;
        //             j = 0;
        //         }
        //     }
        //     if(temp > ans) {
        //         ans = temp;
        //     }
        // }
        // return ans;

//------------      APPROACH 1      ---------------

        Arrays.sort(nums);

        int currLen = 1;
        int lastMin = Integer.MIN_VALUE;
        int largest = 0;

        for(int i = 0; i < n; i++) {
            if((nums[i] - 1) == lastMin) {
                lastMin = nums[i];
                currLen++;
            }
            else if(lastMin != nums[i]-1 && lastMin != nums[i]) {
                currLen = 1;
                lastMin = nums[i];
            }
            else{
                continue;
            }

            largest = Math.max(currLen, largest);
        }

        return largest;
    }
}