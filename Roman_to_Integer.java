# Roman to Integer

**Platform:** LeetCode  
**Difficulty:** Easy  
**Language:** Java  
**Date:** 07 July 2026

## Problem
Convert a Roman numeral into its corresponding integer value.

## Approach
- Traverse the string from left to right.
- Convert each Roman character to its integer value using a helper function.
- If the current value is smaller than the next value, subtract it from the answer.
- Otherwise, add it to the answer.
- This correctly handles subtractive pairs like IV, IX, XL, XC, CD, and CM.

## Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Concepts Used
- String Traversal
- Conditional Logic
- Switch Statement

## Solution
```java
class Solution {
    public int value(char s) {
        switch (s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));

            if (i < s.length() - 1 && curr < value(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}
```