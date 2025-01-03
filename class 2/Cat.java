public class Cat {
    public String name;
    public int age;
    Cat() {
        this.name = "unknown";
        this.age = 5;}

    int Age(){
        return this.age; 
    }
    String Name(){
        return this.name; }
    public static void main(String args[]){
    Cat myCat = new Cat();
    System.out.println("My cat name is " + myCat.Age());
    System.out.println("My cat age is " + myCat.Name());
    }
}
