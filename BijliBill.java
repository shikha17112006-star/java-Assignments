import java.util.Scanner;
class BijliBill{
    public static void main(String []arr){
    int units = new Scanner(System.in).nextInt();
    int bill=0;
    int total=0;
    if(units<=100)
       bill = units*2;
     else if(units<=200)
       bill = 100*2 + (units-100)*3;
      else
        bill = 100*2 + 100*3 + (units-200)*5;
    total = bill+150;
    System.out.println(total);
}
}