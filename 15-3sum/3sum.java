class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();

//-----------       APPROACH 1       ---------------
        // Set<List<Integer>> set = new HashSet<>();

        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         for(int k = j+1; k < n; k++) {
        //             if(nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> temp = Arrays.asList(
        //                     nums[i], nums[j], nums[k]
        //                 );

        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // list.addAll(set);
        // return list;

//------------          APPROACH 2           ----------------

        // Set<List<Integer>> set = new HashSet<>();
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         int third = -1 * (nums[i] + nums[j]);
        //         if(map.containsKey(third)) {
        //             List<Integer> temp = new ArrayList<>();
        //             temp.add(nums[i]);
        //             temp.add(nums[j]);
        //             temp.add(third);

        //             Collections.sort(temp);
        //             set.add(temp);
        //         }
        //         map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
        //     }
        //     map.clear();
        // }
        // list.addAll(set);
        // return list;

//------------          APPROACH 3           ----------------

        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k+1]) {
                        k--;
                    }
                }
            }
        }
        return list;
    }
}