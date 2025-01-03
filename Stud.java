public class Stud {
    public void move() {
        System.out.println("college is open");
    }
}
    class Univ extends Stud {
        public void move() {
            System.out.println("college is closed");
        }
    }
    class Test {
    public static void main(String[] args) {
      
        Stud p1 = new Univ(); 
        p1.move(); 
    }
}



