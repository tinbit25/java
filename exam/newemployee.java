import java.util.*;
class register{
    String name;
    int id;
    int age;
    float salary;
    String address;
   
 void Info() {
    
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address);
    
   }
}
public class newemployee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        register emp=new register();
        
        emp.id=sc.nextInt();
        sc.nextLine();
        emp.name=sc.nextLine();
        emp.age=sc.nextInt();
        emp.salary=sc.nextFloat();
        sc.nextLine();
        emp.address=sc.nextLine();

        emp.Info();
        sc.close();
    } 
}
