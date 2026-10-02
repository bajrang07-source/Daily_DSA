class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();

//-----------          APPROACH 1       --------------

        // Set<List<Integer>> set = new HashSet<>();

        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         for(int k = j+1; k < n; k++) {
        //             for(int l = k+1; l < n; l++) {
        //                 long sum = nums[i] + nums[j];
        //                 sum += nums[k];
        //                 sum += nums[l];
        //                 if(sum == target) {
        //                     List<Integer> temp = new ArrayList<>();
        //                     temp.add(nums[i]);
        //                     temp.add(nums[j]);
        //                     temp.add(nums[k]);
        //                     temp.add(nums[l]);

        //                     Collections.sort(temp);
        //                     set.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }
        // list.addAll(set);
        // return list;

//-----------          APPROACH 2       --------------

        // HashMap<Integer, Integer> map = new HashMap<>();
        // Set<List<Integer>> set = new HashSet<>();

        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         for(int k = j+1; k < n; k++) {
        //             long sum = (long) nums[i] + nums[j] + nums[k];
        //             long num4 = (long) target - sum;
        //             if(num4 >= Integer.MIN_VALUE && num4 <= Integer.MAX_VALUE && map.containsKey((int)num4)) {
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 temp.add((int)num4);

        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //             map.put(nums[k], 0);
        //         }
        //         map.clear();
        //     }
        // }
        // list.addAll(set);
        // return list;

//-----------          APPROACH 3       --------------

        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n; j++) {
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;

                while(k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum < target) {
                        k++;
                    }
                    else if(sum > target) {
                        l--;
                    }
                    else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        list.add(temp);
                        k++;
                        l--;

                        while(k < l && nums[k] == nums[k-1]) {
                            k++;
                        }
                        while(k < l && nums[l] == nums[l+1]) {
                            l--;
                        }
                    }
                }
            }
        }
        return list;
    }
}