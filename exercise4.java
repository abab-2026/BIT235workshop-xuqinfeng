public class exercise4 {
    public static void main(String[] args) {
        // Given values
        double principal = 5000.00;   // P = investment amount
        double rate = 0.04;           // r = 4% annual interest rate
        int years = 10;               // n = number of time periods

        // Compound interest formula A = P * (1 + r)^n
        double amount = principal * Math.pow((1 + rate), years);

        // Display final amount
        System.out.println("Total amount after 10 years: $" + amount);
    }
}
