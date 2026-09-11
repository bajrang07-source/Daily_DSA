class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalCell = n * n;
        int count = 0;
        for(int i = 1; i <= totalCell; i++) {
            if(w * i > maxWeight) {
                break;
            }
            count++;
        }

        return count;
    }
}