import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {
        String studentID;

        // Loop until a valid 10-digit ID is entered
        do {
            studentID = JOptionPane.showInputDialog("Enter student-id:");

            // If user clicks 'Cancel', exit the program
            if (studentID == null) {
                return;
            }
        } while (studentID.length() != 10);

        // Extract characters at index 2, 3, and 4 (the 3rd to 5th digits)
        // For example, from "2513110000", it extracts "131"
        String majorCode = studentID.substring(2, 5);
        String majorName;

        // Use switch to determine the major based on the code
        switch (majorCode) {
            case "131":
                majorName = "Information Technology (IT)";
                break;
            case "132":
                majorName = "Multimedia Technology (MT)";
                break;
            case "133":
                majorName = "Digital Business Information Technology (BI)";
                break;
            case "134":
                majorName = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                majorName = "Data Science and Data Analytics (DS)";
                break;
            default:
                majorName = "Cannot found major";
                break;
        }

        // Display the final result
        String message = "Student ID: " + studentID + "\nMajor: " + majorName;
        JOptionPane.showMessageDialog(null, message);
    }
}