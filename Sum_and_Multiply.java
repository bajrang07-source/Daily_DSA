/*
Problem: Sum and Multiply
Platform: LeetCode
Language: Java

Approach:
1. Convert the integer into an array of digits.
2. Move all non-zero digits to the front while preserving their order.
3. Form a new number using only the non-zero digits.
4. Calculate the sum of the non-zero digits.
5. Return the product of the new number and the sum.

Time Complexity: O(d)
Space Complexity: O(d)

where d = number of digits in n.
*/
```java
class Solution {

    public long sumAndMultiply(int n) {

        long number = 0;
        int sum = 0;

        int i = 0;
        int j = 0;

        String s = String.valueOf(n);
        int[] digits = new int[s.length()];

        // Convert number into digit array
        for (int k = 0; k < s.length(); k++) {
            digits[k] = s.charAt(k) - '0';
        }

        // Move all non-zero digits to the front
        while (j < digits.length) {
            if (digits[j] == 0) {
                j++;
            } else {
                int temp = digits[j];
                digits[j] = digits[i];
                digits[i] = temp;
                i++;
                j++;
            }
        }

        // Form the new number and calculate digit sum
        for (int k = 0; k < i; k++) {
            number = number * 10 + digits[k];
            sum += digits[k];
        }

        return number * sum;
    }
}
```