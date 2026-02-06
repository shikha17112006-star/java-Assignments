import java.util.Scanner;
public class AddWithoutPlus{
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
       int a= s.nextInt();
       int b=s.nextInt();
             while (b != 0) {
            int carry = a & b;      
            a = a ^ b;              
            b = carry << 1;        
        }
        System.out.println(a);
    }
}