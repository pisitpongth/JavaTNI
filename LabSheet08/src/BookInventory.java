import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        String title;
        int number;

        for (int i = 0; i < books.length; i++) {
            title = JOptionPane.showInputDialog("Enter book title:");
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number:"));

            books[i] = new Book(title, number);
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle() + " has " + books[i].getTotalBook() + " books, can borrow " + books[i].getAvailableBook() + " books.");
        }
    }
}
