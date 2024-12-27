import java.util.Scanner;
public class Dog {
    String name;
    String color;
   Dog(String Dname,String Dcolor){
         name = Dname;
         color = Dcolor;
   } 
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name of the dog");
    String name=sc.nextLine(); 
    System.out.println("Enter the color of the dog"); 
    String color=sc.nextLine();
    Dog myDog = new Dog(name,color);
    System.out.println("My dog name is " + myDog.name);
    System.out.println("My dog color is " + myDog.color);
   }
}
