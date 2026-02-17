public class Solution {
    // Function to reverse digits of a number
    public int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }
}
