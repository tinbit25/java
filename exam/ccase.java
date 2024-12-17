import java.util.*;
public class ccase {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
char c=sc.next().charAt(0);
if (c==Character.toLowerCase(c)){
    System.out.println("lower");
}
else if(c==Character.toUpperCase(c)){
    System.out.println("upper");
}
else{
    System.out.println("mix");
}
    }
}
