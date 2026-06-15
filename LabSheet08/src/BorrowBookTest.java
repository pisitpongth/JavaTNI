import javax.swing.*;

public class BorrowBookTest {
    public static void main(String[] args) {
        Book book = new Book("C# Programming", 5);

        boolean isDone = false;

        while (!isDone) {
            int option = JOptionPane.showConfirmDialog(null,
                    "Do you want to borrow books?",
                    "Borrow Book",
                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                if (book.getAvailableBook() > 0) {
                    book.borrowBook();
                    System.out.println("Borrow 1 book, available " + book.getAvailableBook() + " books.");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No books available to borrow now...",
                            "Warning Message",
                            JOptionPane.WARNING_MESSAGE);
                    isDone = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "END MESSAGE");
                isDone = true;
            }
        }
    }
}
