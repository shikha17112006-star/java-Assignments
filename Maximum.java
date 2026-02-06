import java.util.Scanner;
class Maximum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a;
        int negB = ~b + 1;           while (negB != 0) {
            int carry = diff & negB;
            diff = diff ^ negB;
            negB = carry << 1;
        }
        int sign = (diff >> 31) & 1;  // 0 if a >= b, 1 if a < b

        int term = sign * diff;
        int negTerm = ~term + 1;
        int max = a;
        while (negTerm != 0) {
            int carry = max & negTerm;
            max = max ^ negTerm;
            negTerm = carry << 1;
        }

        System.out.println("Maximum = " + max);
        sc.close();
    }
}