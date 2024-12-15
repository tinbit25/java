import java.util.Scanner;
public class spy {
  public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int product=1;
        int sum=0;
        int number;
        System.out.println("num");
        number=sc.nextInt();
        while(number>0){
            int digit=number%10;
            product=product*digit;
            sum=sum+digit;
            number=number/10;
        }
    if(sum==product){
        System.out.println("it is spy number");
    }
        else{
            System.out.println("it is not spy number");
        }
        sc.close();  
}
}