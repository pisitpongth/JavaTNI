import javax.swing.*;

public class Quiz102 {
    public static void main(String[] args) {
        boolean isLoop = false;

        int N = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

        if (N <= 1) {
            while (!isLoop) {
                N = Integer.parseInt(JOptionPane.showInputDialog("The number must be greater than 1" +
                        "\nEnter an integer:"));

                if (N > 1) {
                    isLoop = true;
                }
            }
        }

        int sum = 0;
        String message = "";

        for (int i = 1; i < (N + 1); i++) {
            sum += i;
        }

        for (int i = 1; i < N; i++) {
            message += i + " + ";
        }

        message += N;

        JOptionPane.showMessageDialog(null, "Summation between 1 to " + N +
                "\n" + message + " = " + sum);
    }
}
