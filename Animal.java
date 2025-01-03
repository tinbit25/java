public class Animal {
    String makeSound() {
        return "Some sound";  
    }
}

class Dogs extends Animal {
    String makeSound() {
        return "uuuuu";  
    }

    public static void main(String[] args) {
        Animal a = new Dogs();
        System.out.println(a.makeSound()); 
    }
}
