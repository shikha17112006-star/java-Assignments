import java.util.Scanner;
class QuotientWithoutDivision {

    static int divide(int dividend, int divisor) {

        // Handle divide by zero
        if (divisor == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }

        // Store sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        // Main logic using bitwise shift
        while (dividend >= divisor) {

            int temp = divisor;
            int multiple = 1;

            // Find largest shifted divisor
            while (dividend >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            dividend = dividend - temp;
            quotient = quotient + multiple;
        }

        // Apply sign
        if (negative)
            quotient = -quotient;

        return quotient;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int result = divide(dividend, divisor);

        System.out.println("Quotient = " + result);

        sc.close();
    }
}