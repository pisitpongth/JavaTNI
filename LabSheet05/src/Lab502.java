import javax.swing.JOptionPane;

public class Lab502 {

    public static void main(String[] args) {
        int option;

        // Loop the program until the user clicks "No"
        do {
            option = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your score?",
                    "Check score",
                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                // Input Midterm score with validation (0 - 45)
                int midterm = input_score("Enter midterm-score:", 45);

                // Input Final score with validation (0 - 55)
                int finalScore = input_score("Enter final-score:", 55);

                // Calculate total score
                int totalScore = cal_score(midterm, finalScore);

                // Determine grade
                String grade = find_grade(totalScore);

                // Display the results
                String message = String.format("Your score is %d\nYou get grade %s", totalScore, grade);
                JOptionPane.showMessageDialog(null, message);

            } else {
                // User clicked "No" or closed the dialog
                JOptionPane.showMessageDialog(null, "END PROGRAM!!");
            }

        } while (option == JOptionPane.YES_OPTION);
    }

    /**
     * Determines the grade based on total score (0 - 100)
     */
    public static String find_grade(int score) {
        if (score >= 80 && score <= 100) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        else if (score >= 50) return "D";
        else return "F";
    }

    /**
     * Sums midterm and final scores
     */
    public static int cal_score(int midterm, int Final) {
        return midterm + Final;
    }

    /**
     * Handles input and validates that the score is within 0 and limit_score.
     * If invalid, it shows an error message and asks again.
     */
    public static int input_score(String message, int limit_score) {
        String input;
        int score;
        String prompt = message;

        while (true) {
            input = JOptionPane.showInputDialog(null, prompt);
            score = Integer.parseInt(input);

            // Check if score is in valid range
            if (score >= 0 && score <= limit_score) {
                return score;
            } else {
                // Update prompt message for the next try if input is invalid
                prompt = "Score must be in range between 0 and " + limit_score + "\n" + message;
            }
        }
    }
}