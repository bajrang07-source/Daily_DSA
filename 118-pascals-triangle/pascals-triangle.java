class Solution {
    public long fact(int n) {
        if(n == 1 || n == 0) return 1;

        return n * fact(n-1);
    }

    public int nCr(int p, int r) {
        int res = 1;
        for(int i = 0; i < r; i++) {
            res = res * (p - i);
            res /= i+1;
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

//------------       APPROACH 1       ---------------

        // for(int i = 0; i < numRows; i++) {
        //     List<Integer> list1 = new ArrayList<>();
        //     for(int j = 0; j <= i; j++) {
        //         list1.add((int) fact(i) / (int) (fact(j) * (int) fact(i-j)));
        //     }
        //     list.add(list1);
        // }
        // return list;

//------------       APPROACH 2       --------------

        for(int i = 0; i < numRows; i++) {
            List<Integer> list1 = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                list1.add(nCr(i, j));
            }
            list.add(list1);
        }
        return list;
    }
}