package Arrays.aarayasObject.project;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class LibraryMain {

    private Scanner scanner = new Scanner(System.in);
    private library[] books;

    public void initializeBooks() {
        System.out.println("Enter the number of books:");
        int n = scanner.nextInt();
        books = new library[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Book Name: ");
            String bookName = scanner.nextLine();
            System.out.print("Author Name: ");
            String authorName = scanner.nextLine();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            System.out.print("Number of Copies: ");
            int noOfCopies = scanner.nextInt();

            books[i] = new library(bookId, bookName, authorName, price, noOfCopies);
            System.out.println("Book " + (i + 1) + " added successfully!");
            System.out.println("-----------------------------------");
        }
    }

    public void read() {
        for (library book : books) {
            System.out.println("\nBook Details:");
            book.displayBookDetails();
        }
    }
//search book by id
    public void searchById(int searchId) {
        boolean found = false;
        for (library book : books) {
            if (book.getBookId() == searchId) {
                System.out.println("\nBook found:");
                book.displayBookDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + searchId + " not found.");
        }
    }
//search book by name
    public void searchByName(String searchName) {
        boolean found = false;
        for (library book : books) {
            if (book.getBookName().equalsIgnoreCase(searchName)) {
                System.out.println("\nBook found:");
                book.displayBookDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with name '" + searchName + "' not found.");
        }
    }
// //search book by author
    public void searchByAuthor(String searchAuthor) {
        boolean found = false;
        for (library book : books) {
            if (book.getAuthorName().equalsIgnoreCase(searchAuthor)) {
                System.out.println("\nBook found:");
                book.displayBookDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book by author '" + searchAuthor + "' not found.");
        }
    }
//sort books by price
    public void sortBooks() {
        System.out.println("\nSorting books by price:");
        Arrays.sort(books, Comparator.comparingInt(library::getPrice));
        // Comparator.comparingInt is used to compare the price of books
        // This will sort the books in ascending order based on their price.
        // If you want to sort in descending order, you can use Comparator.comparingInt(library::getPrice).reversed();

        read(); // Display sorted books
    }
}