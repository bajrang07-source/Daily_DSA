/*
Problem: Sum and Multiply
Platform: LeetCode
Language: Java

Approach:
1. For each query, extract the substring digits.
2. Store the digits in an array.
3. Move all non-zero digits to the front while preserving their relative order.
4. Form a new number using only the non-zero digits.
5. Compute the sum of the non-zero digits.
6. Return (newNumber × digitSum) % 1_000_000_007.
7. Repeat the process for every query.

Time Complexity:
- O(k) per query, where k is the length of the queried substring.

Space Complexity:
- O(k)
*/

class Solution {

    private static final int MOD = 1_000_000_007;

    private int calculate(String s, int left, int right) {

        int[] digits = new int[right - left + 1];

        // Convert substring into digit array
        for (int i = 0; i < digits.length; i++) {
            digits[i] = s.charAt(left + i) - '0';
        }

        long number = 0;
        long digitSum = 0;

        int i = 0;
        int j = 0;

        // Move all non-zero digits to the front
        while (j < digits.length) {
            if (digits[j] == 0) {
                j++;
            } else {
                int temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
                i++;
                j++;
            }
        }

        // Form the number and compute digit sum
        for (int k = 0; k < i; k++) {
            number = (number * 10 + digits[k]) % MOD;
            digitSum += digits[k];
        }

        return (int) ((number * digitSum) % MOD);
    }

    public int[] sumAndMultiply(String s, int[][] queries) {

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = calculate(s, queries[i][0], queries[i][1]);
        }

        return result;
    }
}