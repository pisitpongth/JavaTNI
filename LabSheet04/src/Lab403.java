import javax.swing.JOptionPane;

public class Lab403 {
    public static void main(String[] args) {
        // Define constant variables
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        String inputUser;
        String inputPass;

        // Loop until both username and password match the conditions
        while (true) {
            // Get input from keyboard via dialog boxes
            inputUser = JOptionPane.showInputDialog(null, "Enter username:");
            inputPass = JOptionPane.showInputDialog(null, "Enter password:");

            // Check if user clicked cancel (prevents null pointer errors)
            if (inputUser == null || inputPass == null) {
                break;
            }

            // Comparison logic
            // 1. Username matches ignoring case (A == a)
            // 2. Password matches exactly (case-sensitive)
            if (inputUser.equalsIgnoreCase(USERNAME) && inputPass.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break; // Exit the loop on success
            } else {
                // Display error message and the loop will repeat
                JOptionPane.showMessageDialog(null, "Login Fail...",
                        "Incorrect username or password", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}