import java.util.Scanner;
public class second {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("num1");

        int num1=sc.nextInt();
        System.out.println("num2");

        int num2=sc.nextInt();
        
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1="+num1+"\nnum2="+num2);
        sc.close();



    }

    }

