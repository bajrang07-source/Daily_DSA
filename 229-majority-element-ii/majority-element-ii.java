class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

//---------------      APPROACH 1          -----------------

        // for(int i = 0; i < n; i++) {

        //     if(list.contains(nums[i])) continue;

        //     int cnt = 0;
        //     for(int j = i; j < n; j++) {
        //         if(nums[i] == nums[j]) {
        //             cnt++;
        //         }
        //     }
        //     if(cnt > n/3) {
        //         list.add(nums[i]);
        //     }
        // }
        // return list;

//-----------         APPROACH 2         ---------------

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(list.contains(nums[i])) continue;

            if(map.get(nums[i]) > n/3) {
                list.add(nums[i]);
            }
        }

        // for(int key : map.keySet()) {
        //     if(map.get(key) > n/3) {
        //         list.add(key);
        //     }
        // }
        return list;

//-----------         APPROACH 3         ---------------


    }
}