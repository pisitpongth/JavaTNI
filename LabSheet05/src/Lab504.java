import java.util.Scanner;

public class Lab504 {

    /**
     * Overloaded method to check if password length is more than 8 characters.
     *
     * @param pass The password to validate.
     * @return true if length > 8, false otherwise.
     */
    public static boolean check_password(String pass) {
        return pass.length() > 8;
    }

    /**
     * Overloaded method to check if two passwords match (case-sensitive).
     *
     * @param pass         The first password.
     * @param confirm_pass The confirmation password.
     * @return true if they are exactly the same, false otherwise.
     */
    public static boolean check_password(String pass, String confirm_pass) {
        return pass.equals(confirm_pass);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String confirmPassword;

        // Step 1: Input and validate initial password length
        System.out.print("Create password: ");
        password = scanner.nextLine();

        // Loop until password length is valid (> 8 characters)
        while (!check_password(password)) {
            System.out.print("Invalid Password! Create password: ");
            password = scanner.nextLine();
        }

        System.out.println(); // Print a blank line for formatting

        // Step 2: Input and validate password confirmation
        System.out.print("Enter confirm password: ");
        confirmPassword = scanner.nextLine();

        // Loop until confirmation matches the original password
        while (!check_password(password, confirmPassword)) {
            System.out.print("Password do not match! Enter confirm password: ");
            confirmPassword = scanner.nextLine();
        }

        // Final success message
        System.out.println("\nPassword set successfully!!");

        scanner.close();
    }
}