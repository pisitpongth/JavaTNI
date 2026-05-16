import javax.swing.JOptionPane;

public class Lab401 {
    public static void main(String[] args) {
        String fullName;

        while (true) {
            // Get input from user
            fullName = JOptionPane.showInputDialog(null, "Enter your full name:", "Input", JOptionPane.QUESTION_MESSAGE);

            // If user clicks Cancel, stop the program
            if (fullName == null) {
                return;
            }

            // Remove spaces from start and end
            fullName = fullName.trim();

            // Check if there is a space in the middle
            // and make sure the input is not empty
            if (!fullName.isEmpty() && fullName.contains(" ")) {

                // Split using a simple space string
                String[] parts = fullName.split(" ");

                // Check if we have exactly 2 parts (Firstname and Lastname)
                if (parts.length == 2) {

                    // Format Firstname: First letter Upper, rest Lower
                    String first = parts[0];
                    String firstName = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();

                    // Format Lastname: All Upper
                    String lastName = parts[1].toUpperCase();

                    // Show result and exit loop
                    String message = "Welcome, " + firstName + " " + lastName;
                    JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            // If the code reaches here, it means input was wrong.
            // The loop will start again.
        }
    }
}