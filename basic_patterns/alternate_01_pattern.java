// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1 

// 0 1 

// 1 0 1 

// 0 1 0 1 

// 1 0 1 0 1

//Intuition: This pattern prints alternating 1s and 0s in each row, starting with 1 on even-indexed rows and 0 on odd-indexed rows. The value alternates after each print using basic toggling logic.


class Solution {
    public void pattern11(int n) {
        
        for (int i = 1; i <= n; i++) 
        {
            int sum = i;
            for (int j = 1; j <= i; j++) {
                int rem = sum % 2;
                System.out.print(rem + " ");
                sum++;
            }
            System.out.print("\n");

        }

    }
}
