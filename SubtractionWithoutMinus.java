import java.util.Scanner;
class SubtractionWithoutMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // subtraction = a + (~b + 1)
        int negB = ~b + 1;

        while (negB != 0) {
            int carry = a & negB;
            a = a ^ negB;
            negB = carry << 1;
        }
        System.out.println("Difference = " + a);
        sc.close();
    }
}