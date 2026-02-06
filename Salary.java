import java.util.Scanner;
class Salary{
    public static void main(String []arr){
    int basic = new Scanner(System.in).nextInt();
    float salary=0;
    float hra=0,da=0,pf=0;
    if(basic>=30000){
      hra= basic*0.2f;
      da= basic*0.15f;
      pf= basic*0.12f;}
   else{
      hra = basic*0.1f;
      da= basic*0.08f;
      pf= basic*0.12f;}
   salary= basic +hra + da - pf;
  System.out.println(salary);
}
}

