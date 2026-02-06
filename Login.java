import java.util.Scanner;
class Login{
    public static void main(String []arr){
    Scanner s =new Scanner(System.in);
    String user= "shikha123";
    String pass = "s120705";
    int i=0;
    for(i=0;i<3;i++){
     System.out.println("enter username");
     String name=s.next();
     System.out.println("enter password");
     String pass1=s.next();
     if(user.equals(name) && pass.equals(pass1)){
         System.out.println("YOU'VE SUCCESSFULLY LOGGED IN !! ");
          break;
}
     else if(i!=2){
       System.out.println("WRONG ATTEMPT, TRY AGAIN");
     }
}
    if(i==3){
          System.out.println("ACCOUNT LOCKED");}
}
}




