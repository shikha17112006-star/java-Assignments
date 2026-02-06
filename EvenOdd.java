import java.util.Scanner;
class EvenOdd{
    public static void main(String []arr){
    int n = new Scanner(System.in).nextInt();
    if((n&1)==0)
       System.out.println("even");
    else
       System.out.println("odd");
}
}