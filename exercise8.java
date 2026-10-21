import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input two strings
        System.out.print("Enter first string: ");
        String stringOne = scanner.nextLine();

        System.out.print("Enter second string: ");
        String stringTwo = scanner.nextLine();

        // Compare two full strings using equals() method
        boolean isStringEqual = stringOne.equals(stringTwo);
        System.out.println("the two given strings are equal " + isStringEqual);

        // Compare the first character of each string using charAt()
        boolean firstCharEqual = stringOne.charAt(0) == stringTwo.charAt(0);
        System.out.println("First characters of two strings are equal: " + firstCharEqual);

        scanner.close();
    }
}
