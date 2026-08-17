class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> new_set = new HashSet<>();
        for(int i=0;i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                new_set.add(nums2[j]);
            }
        }
        int[] ans = new_set.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}