class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            if(list.contains(nums[i])) continue;

            int cnt = 0;
            for(int j = i; j < n; j++) {
                if(nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if(cnt > n/3) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}