//Pyramid

class Solution {
    public void pattern7(int N) {
        int lastTerm = a + (n-1)*2; 
        //lastTerm = firstTerm + (n-1)d
        //sum = n/2(2a + (n-1)d)
        for (int i = 1; i <= lastTerm; ) 
        {
            int emptyNo = (lastTerm - i)/2;
            printPattern(emptyNo, " ");
            printPattern(i, "*");
            printPattern(emptyNo, " ");
            i = i + 2;
            System.out.print("\n");
        }
    }

    void printPattern(int n, String symbol) {
        for (int i = 1; i <= n; i++) {
            System.out.print(symbol);
        }
    }
}
