class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int sum = 0;
            int num = nums[i];
            while(num > 0) {
                int lastDigit = num % 10;
                sum += lastDigit;
                num /= 10;
            }
            map.put(nums[i], sum);
        }

        Integer[] arr = map.keySet()
                                    .stream()
                                    .sorted(Comparator.comparing((Integer k) -> map.get(k))
                                        .thenComparing(k -> k))
                                    .toArray(Integer[]::new);
        
        int[] original = nums.clone();
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.put(original[i], i);
        }
        int swapCount = 0;
        for(int i = 0; i < n; i++) {
            if(original[i] == arr[i]) continue;

            int correctNum = arr[i];
            int j = pos.get(correctNum);

            int temp = original[i];
            original[i] = original[j];
            original[j] = temp;

            pos.put(original[i], i);
            pos.put(original[j], j);

            swapCount++;
        }
        
        return swapCount;
    }
}