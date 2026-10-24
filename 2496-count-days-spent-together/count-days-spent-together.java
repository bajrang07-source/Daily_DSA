class Solution {
    public int countDay(int month) {
        int sum = 0;
        while(month > 0) {
            switch(month) {
                case 1 :
                    sum += 31;
                    break;
                case 2 :
                    sum += 28;
                    break;
                case 3 :
                    sum += 31;
                    break;
                case 4 :
                    sum += 30;
                    break;
                case 5 :
                    sum += 31;
                    break;
                case 6 :
                    sum += 30;
                    break;
                case 7 :
                    sum += 31;
                    break;
                case 8 :
                    sum += 31;
                    break;
                case 9 :
                    sum += 30;
                    break;
                case 10 :
                    sum += 31;
                    break;
                case 11 :
                    sum += 30;
                    break;
                case 12 :
                    sum += 31;
                    break;
            }
            month--;
        }
        return sum;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int n = 4;

        String aliceMonth1 = arriveAlice.substring(0, 2);
        String aliceMonth2 = leaveAlice.substring(0,2);
        String aliceDay1 = arriveAlice.substring(3,5);
        String aliceDay2 = leaveAlice.substring(3,5);

        String bobMonth1 = arriveBob.substring(0,2);
        String bobMonth2 = leaveBob.substring(0,2);
        String bobDay1 = arriveBob.substring(3,5);
        String bobDay2 = leaveBob.substring(3,5);

        int aM1 = Integer.parseInt(aliceMonth1);
        int aM2 = Integer.parseInt(aliceMonth2);

        int bM1 = Integer.parseInt(bobMonth1);
        int bM2 = Integer.parseInt(bobMonth2);

        int a = countDay(aM1-1) + Integer.parseInt(aliceDay1);
        int b = countDay(aM2 - 1) + Integer.parseInt(aliceDay2);

        int c = countDay(bM1-1) + Integer.parseInt(bobDay1);
        int d = countDay(bM2-1) + Integer.parseInt(bobDay2);

        int ans1 = Math.max(a, c);
        int ans2 = Math.min(b, d);

        return Math.max(0, ans2 - ans1 + 1);
    }
}