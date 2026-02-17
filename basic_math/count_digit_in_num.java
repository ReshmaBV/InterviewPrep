// You are given an integer n. You need to return the number of digits in the number.

// The number will have no leading zeroes, except when the number is 0 itself.


// Input: n = 14

// Output: 2


// Input: n = 236

// Output: 3

class Solution {
    public int countDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum++;
            num = num / 10;
        }
        return sum;
    }
}
