// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5

// Solution :
// We need to print a square matrix of size (2 * n - 1) × (2 * n - 1). The outermost border should contain n, the next inner layer n-1, then n-2, and so on until the center which contains 1. This creates a concentric square pattern.

// We use two nested loops:
// Outer loop runs for rows (i from 0 to 2n-2).
// Inner loop runs for columns (j from 0 to 2n-2).
// For each cell (i, j), compute its distance from all four borders:
// top = i
// left = j 
// bottom = (2n - 2) - i
// right = (2n - 2) - j
// Take the minimum of these four distances. This tells us how deep we are inside the square.
// Print n - minDistance at that position.



class Solution {
    // Function to print concentric square number pattern
    public void pattern22(int n) {
        // Outer loop for rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Inner loop for columns
            for (int j = 0; j < 2 * n - 1; j++) {
                // Calculate distance from top
                int top = i;
                // Calculate distance from left
                int left = j;
                // Calculate distance from bottom
                int bottom = (2 * n - 2) - i;
                // Calculate distance from right
                int right = (2 * n - 2) - j;

                // Take the minimum of all four distances
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Print number (starts with n at border, decreases inside)
                System.out.print((n - minDist) + " ");
            }
            // Move to the next row
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern22(N);
    }
}
