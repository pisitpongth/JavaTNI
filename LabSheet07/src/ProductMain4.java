import java.util.Scanner;

public class ProductMain4 {
    public static void setting_product(Product[] products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];

        setting_product(products);

        System.out.println("Welcome to MINI SHOP!!" +
                "\n--------------------------------------------------" +
                "\nPress 1 to buy Pens (items=" + products[0].quantity + ")" +
                "\nPress 2 to buy Pencils (items=" + products[1].quantity + ")" +
                "\nPress 3 to buy Markers (items=" + products[2].quantity + ")" +
                "\nPress 4 to buy Highlighters (items=" + products[3].quantity + ")" +
                "\n--------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int choice = Integer.parseInt(sc.nextLine());

        boolean isDone = false;

        while (!isDone) {
            if (choice == 1) {
                System.out.println("--------------------------------------------------");

                System.out.print("How many Pens do you want to buy? ");
                int amount = Integer.parseInt(sc.nextLine());

                products[0].sell(amount);

                System.out.println();

                products[0].showInfo();

                isDone = true;
            } else if (choice == 2) {
                System.out.println("--------------------------------------------------");

                System.out.print("How many Pencils do you want to buy? ");
                int amount = Integer.parseInt(sc.nextLine());

                products[1].sell(amount);

                System.out.println();

                products[1].showInfo();

                isDone = true;
            } else if (choice == 3) {
                System.out.println("--------------------------------------------------");

                System.out.print("How many Markers do you want to buy? ");
                int amount = Integer.parseInt(sc.nextLine());

                products[2].sell(amount);

                System.out.println();

                products[2].showInfo();

                isDone = true;
            } else if (choice == 4) {
                System.out.println("--------------------------------------------------");

                System.out.print("How many Highlighters do you want to buy? ");
                int amount = Integer.parseInt(sc.nextLine());

                products[3].sell(amount);

                System.out.println();

                products[3].showInfo();

                isDone = true;
            } else {
                System.out.print("Invalid!! Enter a number: ");
                choice = Integer.parseInt(sc.nextLine());
            }
        }
    }
}
