//Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********


public class StarPattern {

    public void pattern(int n) {
        int max = n*2;
        for (int i = n; i >=1; i--) {
            print("*", i);
            print(" ", (max - i -i));
            print("*", i);
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            print("*", i);
            print(" ", (max - i -i));
            print("*", i);
            System.out.println();
        }
    }

    void print(String symbol, int n) {
        for (int j = 1; j <= n ; j++) {
            System.out.print(symbol);
        }
    }

    public static void main(String[] args) {
        AlphabetTriangular sol = new AlphabetTriangular();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern(N);  // Call the function to print the pattern
    }
}
