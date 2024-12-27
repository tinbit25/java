import java.util.Scanner;

class InnerEmployees {
    String name;
    int id;
    int age;
    float salary;
    String address;

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address);
    }
}

public class Emp {
    public static void main(String[] args) {
        InnerEmployees emp = new InnerEmployees();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name:");
        emp.name = sc.nextLine();

        System.out.println("Enter Employee ID:");
        emp.id = sc.nextInt();

        System.out.println("Enter Employee age:");
        emp.age = sc.nextInt();

        System.out.println("Enter Employee salary:");
        emp.salary = sc.nextFloat();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter Employee address:");
        emp.address = sc.nextLine();

        sc.close();
        emp.display(); // Call the display method
    }
}
