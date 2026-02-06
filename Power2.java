import java.util.Scanner;
class Power2{
     public static void main(String[] arr){
     int n = new Scanner(System.in).nextInt();
     int num=n;
     int count=0;
     while((num&1)==0){
      num= num>>1;
      count++;
      System.out.println(num);
}
     if(num==1)
         System.out.println("yes " + n + " is a " + count +" power of 2");
     else
       System.out.println("no " + n + " is not a power of 2");
}
}