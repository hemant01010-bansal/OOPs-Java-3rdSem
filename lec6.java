import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(){
        System.out.println("object is created");
    }

    Person(String a, int b){
        this.name=a;
        this.age=b;
    }

    Person(String a){
        System.out.println("Third Constructor");
        this.name=a;
    }
}

class Book{
    int bookId;
    String title;
    String author;
    float price;

    static String libraryName;
    static int bookCount;

    Book(int id, String title, String author, float price){
        this.bookId=id;
        this.title=title;
        this.author=author;
        this.price=price;
        bookCount++;
    }

    void displayBookDetails(){
        System.out.println("Book Id: "+this.bookId);
        System.out.println("Book Title: "+this.title);
        System.out.println("Book Author: "+this.author);
        System.out.println("Book Price: "+this.price);
    }

    static void displayLibraryName(){
        System.out.println(libraryName);
    }

    static void displayBookName(){
        System.out.println(bookCount);
    }
}

public class lec6 {
    public static void main(){
        //Constructor is a special method that is automatically called when an object is created.

        Person p1 = new Person("Hemant",18); //we made 2 Constructor but only that Constructor call which is with 'new' keyword.
        System.out.println(p1.name);
        
        Person p2 = new Person();
        System.out.println(p2.name);

        Person p3 = new Person("Hemant");
        System.out.println(p3.name + " " + p3.age);


        //16/07/2026
        Book.libraryName="City Central Library";
        Book b1 = new Book(101,"Java Programming","James Gosling", 650.02f);
        Book b2= new Book(102,"Clean Code","Robert C. Martin", 799.0f);
        Book b3= new Book(103,"Effective Java","Joushua Bloch", 799.0f);
        System.out.println(Book.bookCount);
        b1.displayBookDetails();

        Scanner sc = new Scanner(System.in);
        Book arr[] = new Book[3];
        for (int i=0; i<arr.length; i++){
            System.out.println("Enter Author name: ");
            String author = sc.nextLine();
            System.out.println("Enter Title: ");
            String title = sc.nextLine();
            // sc.nextLine();
            System.out.println("Enter Object ID");
            int bid = sc.nextInt();
            System.out.println("Enter price: ");
            float price = sc.nextFloat();
            sc.nextLine();

            arr[i] = new Book(bid,title,author,price);
        }

        

        //find book with bookID
    }
}
