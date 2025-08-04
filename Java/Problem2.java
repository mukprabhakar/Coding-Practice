// Write a function that takes a string (e.g., "Raju") and converts it to the sum of ASCII values of all its characters.

import java.util.Scanner;

public class Problem2 {

    public static int stringToAsciiSum(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += (int) ch;  // or sum += ch;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int asciiSum = stringToAsciiSum(input);
        System.out.println("ASCII sum of \"" + input + "\": " + asciiSum);
    }
}
