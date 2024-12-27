import java.util.Scanner;
// public class factorial {
//     public static void main (String[] args){
//         int fact=1;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int num=sc.nextInt();
//         for (int i=1;i<=num;i++){
//         fact=fact*i;
        
//         }
        
//         System.out.println(fact);
//         sc.close();



//     }

// }
class factorial {
    public static void main(String[] args) {
int fact=1;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num==0){
    System.out.println("Factorial of 0 is 1");
}
else{
    for(int i=1;i<=num;i++)
    fact*=i;
System.out.println(fact);}
    }}
