public class Book {
    String title;
    String author;
    String price;
Book(String Btitle,String Bauthor){
    title = Btitle;
    author = Bauthor;
    System.out.println("My book title is " + title);
    System.out.println("My book author is " + author);
    
}
Book(String Btitle,String Bauthor,String Bprice){
    title = Btitle;
    author = Bauthor;
    price = Bprice;

    System.out.println("My book title is " + title);
    System.out.println("My book author is " + author);
    System.out.println("My book price is " + price);
}
public static void main(String args[]){
    Book myBook1 = new Book("fikr eske mekabr","hadis alemayehu");
    Book myBook2 = new Book("fikr eske mekabr","hadis alemayehu","$50");
    
}
}
