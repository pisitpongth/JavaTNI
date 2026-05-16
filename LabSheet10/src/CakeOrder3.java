import javax.swing.*;

public class CakeOrder3 {
    public static void main(String[] args) {
        double pound;
        String flavor;
        String message;
        int option;
        BirthdayCake order;

        pound = Double.parseDouble(JOptionPane.showInputDialog("How many pounds do you want?"));
        flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        message = JOptionPane.showInputDialog("Enter a message on cake:");

        order = new BirthdayCake(message, pound, flavor, 400);

        option = JOptionPane.showConfirmDialog(null, order.toString() + "\n" + "\nConfirm this order?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

        while (option == JOptionPane.NO_OPTION) {
            message = JOptionPane.showInputDialog("Enter a new message for changing:");

            order = new BirthdayCake(message, pound, flavor, 400);

            option = JOptionPane.showConfirmDialog(null, order.toString() + "\n" + "\nConfirm this order?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        }

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, order.toString());
        }
    }
}
