package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter customer's name:");
        double bill = Double.parseDouble(JOptionPane.showInputDialog("Enter customer's bill:"));

        int choice = JOptionPane.showConfirmDialog(null,
                "Do you have a member card?",
                "Member",
                JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.NO_OPTION) {
            Regular customer = new Regular(name, bill);

            JOptionPane.showMessageDialog(null,
                    customer.toString());
        } else if (choice == JOptionPane.YES_OPTION) {
            String member = JOptionPane.showInputDialog("Enter a member level [Gold/Premium]:");

            Member customer = new Member(name, bill, member);

            JOptionPane.showMessageDialog(null,
                    customer.toString());
        }
    }
}
