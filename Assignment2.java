import java.util.ArrayList;
import java.util.List;

class Publication {
    public String title;
    public double price;
    public int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public void saleCopy(int quantity) {
        if (quantity <= copies) {
            copies -= quantity;
        } 
        else {
            System.out.println("Not enough copies in stock ,selling the stock available.");
        }
    }

    public double calculateTotalSale() {
        return price * copies;
    }
}

class Book extends Publication {
    private String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void orderCopies(int quantity) {
        copies += quantity;
    }
}

class Magazine extends Publication {
    private int currentIssue;

    public Magazine(String title, double price, int copies, int currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    public void receiveIssue(int issueNumber) {
        currentIssue = issueNumber;
    }

    public void CurrentIssue() {
          System.out.println(currentIssue);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        // Create publications
        Book book1 = new Book("OOP", 25, 100, "ABC");
        Magazine magazine1 = new Magazine("Information technology", 10, 50, 42);

        // Order additional copies of a book
        book1.orderCopies(50);

        // Sell copies of publications
        book1.saleCopy(50);
        System.out.println("Total sale for " + book1.title+" "+ book1.calculateTotalSale() + " /-");
        magazine1.saleCopy(10);
        System.out.println("Total sale for " + magazine1.title +" "+ magazine1.calculateTotalSale()+" /-");
        System.out.print("current issue no.");
        magazine1.CurrentIssue();
       
    }
}
