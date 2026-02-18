// You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.
// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
// Input: n1 = 4, n2 = 6

// Output: 2

// Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.

class Solution {
    public int GCD(int n1, int n2) {
        int iterator = Math.min(n1, n2);
        int res = 1;
        for (int i = iterator; i>=1; i--) {
            int rem1 = n1 % i;
            int rem2 = n2 % i;

            if (rem1 == 0 && rem2 == 0) {
                res = Math.max(res, i);
            }

        }
        return res;
    }
}
