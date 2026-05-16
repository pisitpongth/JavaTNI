import javax.swing.*;

public class BookMain2 {
    public static void main(String[] args) {
        String authorName;
        String nationality;
        int birthyear;
        Author author = null;

        authorName = JOptionPane.showInputDialog("Enter author's name: ");

        int option = JOptionPane.showConfirmDialog(null,
                "Do you prefer to publish your nationality and birth year?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            nationality = JOptionPane.showInputDialog("Enter nationality: ");
            birthyear = Integer.parseInt(JOptionPane.showInputDialog("Enter birthyear: "));

            author = new Author(authorName, nationality, birthyear);
        } else if (option == JOptionPane.NO_OPTION) {
            author = new Author(authorName);
        }

        if (author != null) {
            JOptionPane.showMessageDialog(null, "Author's info: " + author.showAuthorInfo());
        }

        String title;
        String category;
        double price;

        title = JOptionPane.showInputDialog("Enter book title:");
        category = JOptionPane.showInputDialog("Enter book category:");
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price:"));

        Book book = new Book(title, category, price, author);

        JOptionPane.showMessageDialog(null, "Book Information:" + "\n" + book.showBookInfo());
    }
}
