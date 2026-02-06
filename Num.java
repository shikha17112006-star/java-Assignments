import java.util.Scanner;
class Num{
   public static void main(String []arr){
   int num = new Scanner(System.in).nextInt();
   if(num>=0)
     System.out.println("positive");
   else
     System.out.println("negative");
if(num%2==0)
     System.out.println("even");
else
    System.out.println("odd");
if(num%35==0)
   System.out.println("divisible by 5 and 7");
else
   System.out.println("not divisible by both");
}
}




    