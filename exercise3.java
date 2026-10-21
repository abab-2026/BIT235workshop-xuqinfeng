import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        // Input radius value
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate circle area: area = pi * r^2, use Math.pow for square
        double area = PI * Math.pow(radius, 2);

        // Show calculation result
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}
