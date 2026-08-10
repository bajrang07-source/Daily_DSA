class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
        // int alice = 0;
        // int bob = 0;
        // int start = 0; 
        // int end = piles.length-1;
        // // Spoint = start+1;
        // // Epoint = end-1;
        // while(start<end){
        //     int Spoint = start+1;
        //     int Epoint = end-1;
        //     if(piles[start]>piles[end]){
        //         alice += piles[start];
        //         bob += piles[end];
        //         start++;
        //         end--;
        //     }else if(piles[start]<piles[end]){
        //         alice += piles[end];
        //         bob += piles[start];
        //         start++;
        //         end--;
        //     }else{
        //         if(piles[Spoint]>piles[Epoint]){
        //             alice = piles[end];
        //             bob += piles[start];
        //             start++;
        //             end--;
        //         }else{
        //             alice += piles[start];
        //             bob += piles[end];
        //             start++;
        //             end--;
        //         }
        //     }
        // }
        // if(alice>bob) return true;
        // else return false;
    }
}