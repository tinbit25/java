import java.util.Scanner;
public class Book {
    String title;
    String author;
    String price;
Book(String Btitle,String Bauthor){
    title = Btitle;
    author = Bauthor;
    System.out.println("The book title is " + title);
    System.out.println("The book author is " + author);   
}
Book(String Btitle,String Bauthor,String Bprice){
    title = Btitle;
    author = Bauthor;
    price = Bprice;

    System.out.println("The book title is " + title);
    System.out.println("The book author is " + author);
    System.out.println("The book price is " + price);
}
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the title of the book");
    String title = input.nextLine();
    System.out.println("Enter the author of the book");
    String author = input.nextLine();
    System.out.println("Enter the price of the book");
    String price = input.nextLine();
    Book TheBook = new Book(title,author,price);
    System.out.println("Enter the title of the book");
    String title2 = input.nextLine();
    System.out.println("Enter the author of the book");
    String author2 = input.nextLine();
    Book TheBook2 = new Book(title2,author2);
    
}
}
