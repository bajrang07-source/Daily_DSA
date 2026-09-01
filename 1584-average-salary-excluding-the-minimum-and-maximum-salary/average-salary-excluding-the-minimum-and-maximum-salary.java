class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < salary.length; i++) {
            if(salary[i] > max) {
                max = salary[i];
            }
            if(salary[i] < min) {
                min = salary[i];
            }
        }

        int ans = 0;
        // int count = 0;
        for(int j = 0; j < salary.length; j++) {
            ans += salary[j];
        }
        
        return (double)(ans - max - min) / (salary.length-2);
    }
}