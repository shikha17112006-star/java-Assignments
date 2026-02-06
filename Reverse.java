import java.util.Scanner;
class Reverse{
    public static void main(String []arr){
    System.out.println("enter the number");
    int num = new Scanner(System.in).nextInt();
    int sum=0,newnum=0,count=0,digit=0;
    while(num!=0){
       digit =num%10;
       sum = sum+digit;
       newnum = newnum*10 + digit;
       count++;
       num =num/10;
}
    System.out.println("reverse of number is: " + newnum );
    System.out.println("sum of digits: " + sum);
    System.out.println("count of digits: " + count);
}
}


