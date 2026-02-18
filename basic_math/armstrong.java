package patterns;

public class CountNoOfDigits {

    
//   You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.

// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

// Input: n = 153

// Output: true

// Explanation: Number of digits : 3.

// 13 + 53 + 33 = 1 + 125 + 27 = 153.

// Therefore, it is an Armstrong number.
  
  public static void main(String[] args) {
        CountNoOfDigits sol = new CountNoOfDigits();
        int N = 153;  // Set the size of the pattern (5 rows)
        sol.solve(N);  // Call the function to print the pattern
    }
    
    void solve(int num) {
       int pow = noOfDigits(num);
       int numOriginal = num;
       int sum = 0;
        while ( num > 0) {
            int rem = num % 10;
            sum = (int) Math.pow(rem, pow) + sum;
            num = num/10;
        }

       if (sum == numOriginal) {
           System.out.println("true");
       } else {
           System.out.println("false");
       }
    }

    int noOfDigits(int num) {
        int res = 0;
        while ( num > 0) {
            int rem = num % 10;
            if (rem > 0) {
                res++;
            }
            num = num/10;
        }
        return res;
    }
}
