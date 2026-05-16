import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop" +
                "\n------------------------------" +
                "\nPress [1] to buy Pen" +
                "\nPress [2] to buy Notebook");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int option = Integer.parseInt(sc.nextLine());

        boolean isDone = false;

        while (!isDone) {
            if (option == 1) {
                System.out.println();

                product1.showInfo();

                System.out.println("-------------------------------------------------");

                System.out.print("How many Pens do you want to buy? ");
                int amount = Integer.parseInt(sc.nextLine());

                product1.sell(amount);

                System.out.println("-------------------------------------------------");

                product1.showInfo();

                isDone = true;
            } else if (option == 2) {
                System.out.println();

                product2.showInfo();

                System.out.println("-------------------------------------------------");

                System.out.print("How many Notebooks do you want to buy? ");
                int amount = Integer.parseInt(sc.nextLine());

                product2.sell(amount);

                System.out.println("-------------------------------------------------");

                product2.showInfo();

                isDone = true;
            } else {
                System.out.print("Invalid number! Enter a number, again: ");
                option = Integer.parseInt(sc.nextLine());
            }
        }
    }
}
