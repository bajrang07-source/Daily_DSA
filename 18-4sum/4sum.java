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

        HashMap<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long num4 = (long) target - sum;
                    if(num4 >= Integer.MIN_VALUE && num4 <= Integer.MAX_VALUE && map.containsKey((int)num4)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)num4);

                        Collections.sort(temp);
                        set.add(temp);
                    }
                    map.put(nums[k], 0);
                }
                map.clear();
            }
        }
        list.addAll(set);
        return list;
    }
}