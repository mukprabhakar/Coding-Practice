// Write a program that finds the summation of every number from 1 to num (both inclusive). The number will always be a positive integer greater than 0. Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.

// For example (Input -> Output):

// 2 -> 3 (1 + 2)
// 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)

import java.util.Scanner;

public class Problem6 {
     public static int summation(int n) {
        int sum = 0;  // Initialize sum outside the loop
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add i to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scanner.nextInt();

        int result = summation(a);

        System.out.println("The summation of the nubers is : "+ result);
    }
}
