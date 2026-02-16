// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *

// **

// ***

// ****

// *****

// ****

// ***

// *

package patterns;

public class Pattern {

    public void pattern10(int n) {

        boolean inc = true;
        System.out.println("*");
        int i = 2;
        while ( i > 0) {
            for (int j = 1 ; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n && inc) {
                i++;
            } else {
                inc = false;
                i--;
            }
        }
    }

    public static void main(String args[]) {
        Pattern p = new Pattern();
        p.pattern10(4);
    }
}
