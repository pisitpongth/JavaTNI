import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        String name;
        double price;
        int quantity;
        int amount;
        double changePrice;

        JOptionPane.showMessageDialog(null, "Welcome to Product Stock System");

        name = JOptionPane.showInputDialog("Enter product name:");
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));

        product.name = name;
        product.price = price;
        product.quantity = quantity;

        product.showInfo();

        System.out.println();

        int option1 = JOptionPane.showConfirmDialog(null,
                "Do you want to add more item?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (option1 == JOptionPane.YES_OPTION) {
            amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            product.addStock(amount);
        } else {

        }

        int option2 = JOptionPane.showConfirmDialog(null,
                "Do you want to change price?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (option2 == JOptionPane.YES_OPTION) {
            changePrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            product.changePrice(changePrice);
        } else {

        }

        System.out.println();

        product.showInfo();
    }
}
