public class Bakery {
    private String flavor;
    private double unitPrice;
    private int packingCost = 5;

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }

    public Bakery() {
        this.flavor = "";
        this.unitPrice = 0;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String toString() {
        return "Thank you for your order!";
    }

    public int getPackingCost() {
        return this.packingCost;
    }

    public double calculateTotalPrice() {
        return this.unitPrice + this.packingCost;
    }
}
