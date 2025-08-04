// Write a Java program that takes a string input from the user and prints the ASCII value of each character in the string.
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Read the entire line

        System.out.println("Character\tASCII Value");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + "\t\t" + ascii);
        }
    }
}
