
//reverse pyramid

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *********
//  *******
//   *****
//    ***
//     *


class Solution {
    public void pattern8(int n) {
        int lastTerm = 1 + (n-1)*2;
        for (int i = lastTerm; i >= 1; ) 
        {
            int emptyNo = (lastTerm - i)/2;
            printPattern(emptyNo, " ");
            printPattern(i, "*");
            printPattern(emptyNo, " ");
            i = i - 2;
            System.out.print("\n");
        }
    }


    void printPattern(int n, String symbol) {
        for (int i = 1; i <= n; i++) {
            System.out.print(symbol);
        }
    }
}
