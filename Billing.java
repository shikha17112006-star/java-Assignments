import java.util.Scanner;
class Billing{
   public static void main(String []arr){
   int paisa= new Scanner(System.in).nextInt();
   int quantity= new Scanner(System.in).nextInt();
   float bill=0;
   float total=0;
   int price = quantity*paisa;
   if(price<=5000)
       if(price>=2000)
          bill= price - price*0.05f;
        else
           bill= price;
   else
       bill=price- price*0.1f;
  total = bill+ bill*0.18f;
  System.out.println(total);
}
}  
