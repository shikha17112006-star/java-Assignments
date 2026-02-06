import java.util.Scanner;
class SetBit{
    public static void main(String []arr){
    int n = new Scanner(System.in).nextInt();
    int num=n;
    int bit=0;
    int count=0;
    while(num!=0){
        bit= (num&1);
        if(bit==1)
           count++;
        num=num>>1;
}
    System.out.println(" total set bits: " + count );
}
}
        

    
    
