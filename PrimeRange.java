import java.util.Scanner;
class PrimeRange{
    public static void main(String []arr){
    Scanner s=new Scanner(System.in);
    System.out.println("enter range");
    int num1= s.nextInt();
    int num2 =s.nextInt();
    int count=0;
    for(int i=num1;i<=num2;i++){
       for(int j=1;j<=i;j++){
          if(i%j==0)
             count++;
           }
      if(count==2)
             System.out.println(i);
      count=0;
}
}
}