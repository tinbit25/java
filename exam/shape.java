import java.util.*;
class rectangle{
        
    float area(float w, float h){
float areas=w*h;
return areas;
}}
class circle{
        
    float area(float r){
float areas=r*r*3.14f;
return areas;
}}
class triangle{
        
    float area(float b, float h){
float areas=(b*h)/2;
return areas;
}}
public class shape {
    public static void main(String[] args){
rectangle area=new rectangle();
circle area2=new circle();
triangle area3=new triangle();
Scanner sc= new Scanner(System.in);
float width=sc.nextFloat();
float height=sc.nextFloat();
float x=area.area(width, height);
System.out.println("areais"+x);
float r=sc.nextFloat();
System.out.println("circle"+area2.area(r));
float base=sc.nextFloat();
float heigh=sc.nextFloat();
float y=area3.area(base, heigh);
System.out.println("areais"+y);

sc.close();
    } 
}
