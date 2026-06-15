import javax.swing.*;
import java.util.Scanner;

public class BookMain3 {
    public static Book[] book_initial() {
        Book[] books = new Book[] {
                new Book("Java Programming", "Computer", 325.75, new Author("Malee")),
                new Book("English 101", "Languages", 200, new Author("Tipco")),
                new Book("Japanese 101", "Languages", 210, new Author("Tipco")),
                new Book("R Programming", "Computer", 400, new Author("Malee"))
        };
        return books;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String authorName;
        Book[] books = book_initial();
        String bookList = "";

        System.out.print("Enter author's name: ");
        authorName = sc.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getName().equalsIgnoreCase(authorName)) {
                bookList += "- " + books[i].getTitle() + "\n";
            }
        }

        if (bookList.isEmpty()) {
            System.out.println("No books found from this author...");
        }
        System.out.println(bookList);
    }
}
