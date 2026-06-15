package CoffeeShop;

public abstract class Drink implements Priceable {
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName, double basePrice, String size) {
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public abstract double calculateFinalPrice();

    public String toString() {
        return "Your order: " + getDrinkName() + " (Size: " + this.size.toUpperCase() + ")";
    }

    @Override
    public double getBasePrice() {
        return this.basePrice;
    }

    @Override
    public double getSizeExtra() {
        if (this.size.equals("S") || this.size.equals("s")) {
            return 0;
        } else if (this.size.equals("M") || this.size.equals("m")) {
            return 10;
        } else if (this.size.equals("L") || this.size.equals("l")) {
            return 15;
        } else {
            return -1;
        }
    }
}
