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

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < n; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        //     if(list.contains(nums[i])) continue;

        //     if(map.get(nums[i]) > n/3) {
        //         list.add(nums[i]);
        //     }
        // }

        // // for(int key : map.keySet()) {
        // //     if(map.get(key) > n/3) {
        // //         list.add(key);
        // //     }
        // // }
        // return list;

//-----------         APPROACH 3         ---------------

        int cnt1 = 0;
        int ele1 = -1;
        int cnt2 = 0;
        int ele2 = -1;
        for(int i = 0; i < n; i++) {
            if(cnt1 == 0 && nums[i] != ele2) {
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != ele1) {
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]) {
                cnt1++;
            }
            else if(ele2 == nums[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int j = 0; j < n; j++) {
            if(nums[j] == ele1) {
                cnt1++;
            }
            else if(nums[j] == ele2) {
                cnt2++;
            }
        }

        if(cnt1 > n/3) {
            list.add(ele1);
        }
        if(cnt2 > n/3) {
            list.add(ele2);
        }
        return list;
    }
}