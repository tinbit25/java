import java.util.Scanner;
 class InnerEmployees {
    String name;
    int id;
    int age;
    float salary;
    String adress;   
}

public class Employees{
    
    public static void main (String[] args){
        InnerEmployees emp = new InnerEmployees();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Employee name:");
       emp.name = sc.nextLine(); 
        System.out.println("Enter Employee name:");
        emp.id = sc.nextInt(); 
        System.out.println("Enter Employee age:");
        emp.age = sc.nextInt();
        System.out.println("Enter Employee salary:");
        emp.salary= sc.nextFloat();
        System.out.println("Enter Employee adress:");
        emp.adress= sc.nextLine();
        sc . close();
        display ();
    }
        static void display (){

            System.out.println("employee id:"+emp.id);
            System.out.println("employee name:"+emp.name);
            System.out.println("employee age:"+emp.age);
            System.out.println("employee salary:"+emp.salary);
            System.out.println("employee adress:"+emp.adress);
        }
    }
