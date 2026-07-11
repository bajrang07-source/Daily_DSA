class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k = 0;
        while(i<nums1.length || j<nums2.length){
            if(i == nums1.length){
                arr[k++] = nums2[j++];
            }else if(j == nums2.length){
                arr[k++] = nums1[i++];
            }else{
                if(nums1[i]>nums2[j]){
                    arr[k++] = nums2[j++];
                }else{
                    arr[k++] = nums1[i++];
                }
            }
            // if(j<nums2.length){
            //     if(nums1[i]>nums2[j]){
            //         arr[k++] = nums2[j++];
            //     }else{
            //         arr[k++] = nums1[i++];
            //     }
            // }else{
            //     arr[k++] = nums1[i++];
            // }
        } 
        if(arr.length % 2 == 0){
            int num = arr.length/2;
            int num1 = arr[num-1];
            return (arr[num] / 2.0) + (arr[num - 1] / 2.0);
        }else{
            return (double) arr[arr.length/2];
        }
    }
}