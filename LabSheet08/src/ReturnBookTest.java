import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 5);
        int option;
        boolean isDone = false;

        while (!isDone) {
            option = JOptionPane.showConfirmDialog(null,
                    "Do you want to borrow/return book?",
                    "Borrow/Return Book",
                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {

                String input = JOptionPane.showInputDialog("Press 1 to borrow book" +
                        "\nPress 2 to return book");

                if (input.equals("1")) {

                    if (book.getAvailableBook() == 0) {
                        JOptionPane.showMessageDialog(null,
                                "No books available to borrow...",
                                "Warning Message",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        book.borrowBook();
                        System.out.println("Borrow 1 book, available " + book.getAvailableBook() + " books.");
                    }

                } else if (input.equals("2")) {

                    if (book.getTotalBook() == book.getAvailableBook()) {
                        JOptionPane.showMessageDialog(null,
                                "Cannot return! All books are already here.",
                                "Warning Message",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        book.returnBook();
                        System.out.println("Returned 1 book, available " + book.getAvailableBook() + " books.");
                    }

                } else {
                    isDone = true;
                    JOptionPane.showMessageDialog(null, "END PROGRAM");
                }

            } else if (option == JOptionPane.NO_OPTION) {
                isDone = true;
                JOptionPane.showMessageDialog(null, "END PROGRAM");
            }
        }
    }
}
