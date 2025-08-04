//  Write a code to print the ASCII code of the character

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);  // Reads the first character

        int ascii = (int) input;  // Convert char to ASCII (int)

        System.out.println("ASCII value of '" + input + "' is: " + ascii);
    }
}
