import javax.swing.JOptionPane;

public class Lab501 {

    public static void main(String[] args) {
        int option;

        // Loop the program until the user clicks "No"
        do {
            // Show Confirm Dialog: Returns 0 for Yes, 1 for No
            option = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your BMI?",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                // Input Weight (kg) via Input Dialog
                String weightStr = JOptionPane.showInputDialog("Enter your weight (kg.):");
                double weight = Double.parseDouble(weightStr);

                // Input Height (cm) via Input Dialog
                String heightStr = JOptionPane.showInputDialog("Enter your height (cm.):");
                double heightCm = Double.parseDouble(heightStr);

                // Calculate BMI by calling cal_bmi method
                double bmi = cal_bmi(weight, heightCm);

                // Get health status by calling check_bmi method
                String result = check_bmi(bmi);

                // Display the results formatted to 2 decimal places
                String message = String.format("Your BMI = %.2f\nYour BMI result = %s", bmi, result);
                JOptionPane.showMessageDialog(null, message);

            } else {
                // Display end message if "No" is clicked or window is closed
                JOptionPane.showMessageDialog(null, "END PROGRAM!!");
            }

        } while (option == JOptionPane.YES_OPTION);
    }

    /**
     * Calculates BMI from weight (kg) and height (cm)
     * Formula: BMI = weight / (height_in_meters ^ 2)
     */
    public static double cal_bmi(double weight, double height_cm) {
        double height_m = height_cm / 100; // Convert cm to meters
        return weight / (height_m * height_m);
    }

    /**
     * Determines the BMI category based on the calculated value
     */
    public static String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}