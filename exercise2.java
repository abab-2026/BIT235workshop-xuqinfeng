import java.util.Scanner;

public class exercise2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Celsius degree from user
        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        // Formula F = C * 9 / 5 + 32
        double fahrenheit = celsius * 9.0 / 5 + 32;

        // Output converted result
        System.out.println("Temperature in degrees Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
