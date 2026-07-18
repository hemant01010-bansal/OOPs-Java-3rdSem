class Book{
    int BookID;
    String title;
    String author;
    int price;
    int quantity;
    static String libraryName;
    static int totalBooksCreated;

    Book(int BookID, String title, String author, int price, int quantity){
        this.BookID=BookID;
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    
    Book(Book other){
        this.BookID=other.BookID;
        this.title=other.title;
        this.author=other.author;
        this.price=other.price;
        this.quantity=other.quantity;

    }

    void displayDetails(){
        System.out.println(this.BookID);
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }

    void updatePrice(int price){
        this.price=price;
    }

    static void displayLibraryInfo(){
        System.out.println(libraryName);
    }

    static void displayTotalBooks(){
        System.out.println("Total No. of Books: "+totalBooksCreated);
    }

}

public class librarymangement {
    
}
