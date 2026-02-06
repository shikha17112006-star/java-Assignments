import java.util.Scanner;
class Operation{
   public static void main(String []arr){
   Scanner s = new Scanner(System.in);
   int num1 = s.nextInt();
   int num2 = s.nextInt();
   System.out.println("enter operation add/sub/multiply/division/modulus");
   s.nextLine();
   String opr = s.nextLine();
   switch(opr){
     case "add" :
        System.out.println( num1+num2);
        break;
     case "sub" :
         System.out.println( num1-num2);
         break;
     case "multiply" :
          System.out.println( num1*num2);
          break;
     case "division" :
           System.out.println( num1/num2);
           break;
     case "modulus" :
           System.out.println( num1%num2);
           break;
     default:
           System.out.println("none");
}
}
}




     