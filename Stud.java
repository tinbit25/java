public class Stud {
    public static void main(String[] args) {
      
        Practice p1 = new Univ(); 
        p1.move(); 
    }
}

class Practice {
    public void move() {
        System.out.println("college is open");
    }
}

class Univ extends Practice {
    public void move() {
        System.out.println("college is closed");
    }
}

