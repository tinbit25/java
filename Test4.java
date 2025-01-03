import java.util.Scanner;
class Shape {
    float length;
    float width;
    
    Shape(float length,float width) {
        this.length = length;
        this.width = width;
    }
    
    float getPerimeter() {
        return 2*length+2*width;
    }
    
    float getArea() {
        return length*width;
    }
}

class Cicle extends Shape {
    float radius;

    Cicle(float radius) {
        super(0,0);
        this.radius = radius;
    }
    
    float getPerimeter() {
        return 2 * 3.14f * radius;
    }
    
    float getArea() {
        return 3.14f * radius * radius;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        Cicle c = new Cicle(radius);
    
        System.out.println("Perimeter of circle: " + c.getPerimeter());
        System.out.println("Area of circle: " + c.getArea());
    }
}