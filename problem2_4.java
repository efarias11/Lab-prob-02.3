import java.util.Scanner;
public class problem2_4 {
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Book b = new Book();
        
        int flag = 1;
        do{
            System.out.print("What is the title of your book?: ");
            String title = kb.nextLine();
            b.setTitle(title);
    
            System.out.print("What are the name(s) of the author(s)?: ");
            String authors = kb.nextLine();
            String[] authNameArry = authors.split(" ");
            b.setAuthors(authNameArry);
    
            System.out.print("How much does your book cost?: ");
            double price = kb.nextDouble();
            b.setPrice(price);
    
            System.out.print("What is the number of copies in stock?: ");
            int stock = kb.nextInt();
            b.setStock(stock);
    
            System.out.print("What year was the book published?: ");
            int year = kb.nextInt();
            b.setPublishedYear(year);
            
            b.adjustmentFlag(flag);
        }while(flag == 1);
    }
}
class Book{
    private String title;
    private String[] authors; // up to four authors
    private String publisher;
    private double price;
    private int stock;
    private int publicationYear;

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthors(String[] authors){
        this.authors = authors;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setPublishedYear(int year){
        this.publicationYear = year;
    }
    public String getTitle(){
        return this.title;
    }
    public String[] getAuthors(){
        return this.authors;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public double getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public int adjustmentFlag(int flag){
        Scanner kb = new Scanner(System.in);

        System.out.print("Do you want to adjust anything? 0(No)/1(Yes): ");
        flag = kb.nextInt();
        System.out.println(" ");
        return flag;
    }
}
