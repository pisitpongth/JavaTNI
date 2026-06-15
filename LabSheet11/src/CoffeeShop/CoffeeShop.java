package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    public static Espresso orderEspresso() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = sc.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = sc.next();

        if (addShot.equals("y") || addShot.equals("Y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int shot = sc.nextInt();

            espresso.addShot(shot);
        }
        System.out.println(espresso.toString());

        return espresso;
    }

    public static Frappuccino orderFrappuccino() {
        Scanner sc = new Scanner(System.in);
        boolean whipped = false;

        System.out.print("Enter a size: ");
        String size = sc.next();

        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String addWhipped = sc.next();

        if (addWhipped.equals("y") || addWhipped.equals("Y")) {
            whipped = true;
        }

        Frappuccino frappuccino = new Frappuccino(size, whipped);

        System.out.println(frappuccino.toString());

        return frappuccino;
    }

    public static void main(String[] args) {
        boolean isDone = false;
        Espresso espresso = null;
        Frappuccino frappuccino = null;
        int countEspresso = 0;
        int countFrappuccino = 0;
        double totalPrice = 0;

        while (!isDone) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");

            System.out.print("Enter an option: ");
            int option = sc.nextInt();

            if (option == 1) {
                espresso = orderEspresso();
                countEspresso += 1;
                totalPrice += espresso.calculateFinalPrice();
            } else if (option == 2) {
                frappuccino = orderFrappuccino();
                countFrappuccino += 1;
                totalPrice += frappuccino.calculateFinalPrice();
            }

            System.out.println();

            System.out.print("Do you want to order more [y/Y]? ");
            String orderMore = sc.next();

            if (orderMore.equals("y") || orderMore.equals("Y")) {

            } else {
                isDone = true;
            }
        }
        System.out.println();
        System.out.println("You ordered " + countEspresso + " Espresso");
        System.out.println("You ordered " + countFrappuccino + " Frappuccino");
        System.out.println("Total price = " + totalPrice);
    }
}
