import java.util.*;

public class Library {
    String address;
    List<Book> books = new ArrayList<>();

    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    // static method -> cannot use any object data
    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String title) {
        for(int i = 0; i < this.books.size(); i++) {
            Book currBook = this.books.get(i);
            if(currBook.title.equals(title) && !currBook.isBorrowed()) {
                currBook.borrowed();
                System.out.println("You successfully borrowed " + title);
                return;
            } else if(currBook.title.equals(title) && currBook.isBorrowed()) {
                System.out.println("Sorry, this book is already borrowed.");
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
        return;
    }

    public void printAvailableBooks() {
        if(this.books.size() == 0) {
            System.out.println("No books in catalog.");
        }
        else {
            for(int i = 0; i < this.books.size(); i++) {
                Book currBook = this.books.get(i);
                if(!currBook.isBorrowed()) {
                    System.out.println(currBook.getTitle());
                }
            }
        }
    }

    public void returnBook(String title) {
        for(int i = 0; i < this.books.size(); i++) {
            Book currBook = this.books.get(i);
            if(currBook.title.equals(title) && currBook.isBorrowed()) {
                currBook.returned();
                System.out.println("You successfully returned " + title);
                return;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // Create two libraries
        Library firstLibrary = new Library("123 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lord of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lord of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available books from the first library
        System.out.println("Books available from the first library:");
        firstLibrary.printAvailableBooks();
    }
}
