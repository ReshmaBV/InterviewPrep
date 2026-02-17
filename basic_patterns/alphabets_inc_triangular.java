package patterns;

//Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
//
//A
//AB
//ABC
//ABCD
//ABCDE

//The idea is to print increasing sequences of alphabets in each row.
//In the inner loop, print characters starting from 'A' up to 'A' + i.

public class AlphabetTriangular {

    public void pattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AlphabetTriangular sol = new AlphabetTriangular();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern(N);  // Call the function to print the pattern
    }
}
