// Write a program to change the integer at given radix.


// Method 1

import java.util.Scanner;

public class Problem5 {

     public static int stringToNumber(String str) {
        return Integer.parseInt(str,2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String binaryString = scanner.nextLine();

        int result = stringToNumber(binaryString); // Call the function
        System.out.println("Converted number: " + result);

    }
}



// Method 2


// import java.util.Scanner;

// public class Problem5 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String binaryString = scanner.nextLine();

//         int result = Integer.parseInt(binaryString,2);
//         System.out.println("Converted number: " + result);

//     }
// }
