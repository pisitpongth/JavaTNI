import java.util.Scanner;

public class Lab503 {

    /**
     * Counts how many times a specific vowel appears in a given message.
     * * @param message The input string to check.
     *
     * @param letter The specific vowel character to count.
     * @return The number of occurrences (case-insensitive).
     */
    public static int count_vowel(String message, char letter) {
        int count = 0;
        // Convert message to lowercase to handle case-insensitivity
        String lowerMessage = message.toLowerCase();
        char lowerLetter = Character.toLowerCase(letter);

        // Loop through the string and count matches
        for (int i = 0; i < lowerMessage.length(); i++) {
            if (lowerMessage.charAt(i) == lowerLetter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get message from user
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        System.out.println("\nList of vowel in \"" + message + "\"");

        // Define the vowels we want to check
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        // Loop through each vowel and call count_vowel() for each
        for (char v : vowels) {
            int result = count_vowel(message, v);
            System.out.println("The letter '" + v + "' appears " + result + " time(s).");
        }

        scanner.close();
    }
}