class Solution {
    public int[] arrayRankTransform(int[] arr) {

        //Approach 1 - Encounter Time LIMIT EXCEEDED ISSUE
        int[] ans = new int[arr.length];
        int rank = 1;
        while (true) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            if (min == Integer.MAX_VALUE) {
                break;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    ans[i] = rank;
                    arr[i] = Integer.MAX_VALUE;
                }
            }
            rank++;
        }
        return ans;
//----------------------------------------------------------------------------------
        //APPROACH 2 - USING HASHMAP:
        
        int[] arr1 = arr.clone();
        Arrays.sort(arr1);
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                continue;
            }else{
                map.put(arr1[i], rank++);
            }
        }
        for(int j=0; j<arr.length; j++){
            int val = map.get(arr[j]);
            ans[j] = val;
        }
        return ans;
    }
}
