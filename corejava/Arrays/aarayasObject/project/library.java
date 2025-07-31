package Arrays.aarayasObject.project;

public class library {
    private int BookId;
    private String BookName;
    private String AuthorName;
    private int Price;
    private int NoOfCopies;

    public int getNoOfCopies() {
        return NoOfCopies;
    }


    public String getBookName() {
        return BookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public int getPrice() {
        return Price;
    }

    public int getBookId() {
        return BookId;
    }

    // Constructor
    public library(int bookId, String bookName, String authorName, int price, int noOfCopies) {
        this.BookId = bookId;
        this.BookName = bookName;
        this.AuthorName = authorName;
        this.Price = price;
        this.NoOfCopies = noOfCopies;
    }


    public void displayBookDetails() {
        System.out.println("Book ID: " + BookId);
        System.out.println("Book Name: " + BookName);
        System.out.println("Author Name: " + AuthorName);
        System.out.println("Price: " + Price);
        System.out.println("Number of Copies: " + NoOfCopies);
    }

}
