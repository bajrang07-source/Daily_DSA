class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int ele : stones) {
            a.add(ele);
        }
        while (a.size() > 1) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int idx1 = -1;
            int idx2 = -1;
            for (int i = 0; i < a.size(); i++) {
                int current = a.get(i);
                if (current > max1) {
                    max2 = max1;
                    idx2 = idx1;
                    max1 = current;
                    idx1 = i;
                } else if (current > max2) {
                    max2 = current;
                    idx2 = i;
                }
            }
            if (max1 == max2) {
                if (idx1 > idx2) {
                    a.remove(idx1);
                    a.remove(idx2);
                } else {
                    a.remove(idx2);
                    a.remove(idx1);
                }
            } else {
                int newWeight = max1 - max2;
                a.set(idx1, newWeight);
                a.remove(idx2);
            }
        }
        if (a.isEmpty()) {
            return 0;
        }
        return a.get(0);
    }
}