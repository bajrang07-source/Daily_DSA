class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] even = new int[(nums.length + 1) / 2];
        int[] odd = new int[nums.length / 2];
        int evn = 0;
        int od = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                even[evn] = nums[i];
                evn++;
            }else{
                odd[od] = nums[i];
                od++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int i=0; 
        int j=odd.length-1;
        while(i<j){
            int temp = odd[i];
            odd[i] = odd[j];
            odd[j] = temp;
            i++;
            j--;
        }
        int[] answer = new int[even.length + odd.length];

        int n1=0;
        int n2=0;
        for(int t=0; t<answer.length; t++){
            if(t%2 == 0){
                answer[t] = even[n1++];
            }else{
                answer[t] = odd[n2++];
            }
        }
        return answer;
    }
}