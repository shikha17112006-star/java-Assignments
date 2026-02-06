import java.util.Scanner;
class Atm{
  public static void main(String[] arr){
  Scanner s = new Scanner(System.in);
  System.out.println("enter account balance");
  int balance = s.nextInt();
  System.out.println("enter withdrawal");
  int withdrawal= s.nextInt();
  if(balance-withdrawal>=1000 && withdrawal%100==0)
     System.out.println("success");
   else 
      System.out.println("failure");
 }
}