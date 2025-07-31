package Arrays.aarayasObject.project;


import java.util.Scanner;

public class Libmain {
    public static void main(String[] args) {
        LibraryMain libraryMain = new LibraryMain();
        libraryMain.initializeBooks(); // Initialize the library with book details
       // Call the read method to display book details
        Scanner scanner = new Scanner(System.in);
        String again= String.valueOf('y');


        while (again.equalsIgnoreCase("y")) {
            System.out.println("Library Management System");
            System.out.println("1. Search for a book by ID");
            System.out.println("2. Search for a book by Name");
            System.out.println("3. Search for a book by Author");
            System.out.println("4.sort");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1 to 6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanner.nextInt();
                    libraryMain.searchById(Integer.parseInt(String.valueOf(searchId)));
                    break;
                case 2:
                    System.out.print("Enter Book Name to search: ");
                    scanner.nextLine(); // Consume newline
                    String searchName = scanner.nextLine();
                    libraryMain.searchByName(searchName);
                    break;
                case 3:
                    System.out.print("Enter Author Name to search: ");
                    String searchAuthor = scanner.nextLine();
                    libraryMain.searchByAuthor(searchAuthor);
                    break;
                case 4:
                    libraryMain.sortBooks();
                    break;
                case 5:
                    libraryMain.read();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Do you want to perform another calculation? (y/n)");
            again = scanner.next();
            System.out.println(); // Print a new line for better readability}}
        }
        scanner.close(); // Close the scanner to avoid resource leaks
        System.out.println("Thank you for using the Library Management System!");

    }
}
