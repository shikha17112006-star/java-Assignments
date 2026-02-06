import java.util.Scanner;
class MultiplyBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = (n << 3) - n;
        System.out.println("Result = " + result);
        sc.close();
    }
}