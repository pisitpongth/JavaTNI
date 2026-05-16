package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size);
    }

    public void addShot(int shot) {
        this.shot += shot;
    }

    public int getShot() {
        return this.shot;
    }

    public String toString() {
        return super.toString() +
                ((getShot() > 0) ? "\nAdded " + getShot() + " shot" : "") +
                "\n" + "Total price = " + calculateFinalPrice() + " Baht";
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (getShot() * 15) + getSizeExtra();
    }
}
