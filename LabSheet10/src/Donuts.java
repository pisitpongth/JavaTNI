public class Donuts extends Bakery {
    private int piece;
    private boolean addSprinkles;

    public Donuts(boolean addSprinkles, int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.addSprinkles = addSprinkles;
        this.piece = piece;
    }

    public boolean isPackingBox() {
        if (getBoxNumber() >= 1) {
            return true;
        }
        return false;
    }

    public int getBoxNumber() {
        return this.piece / 6;
    }

    public int getBagNumber() {
        return this.piece % 6;
    }

    public boolean isAddSprinkles() {
        return this.addSprinkles;
    }

    @Override
    public double calculateTotalPrice() {
        return (getUnitPrice() * this.piece) + (isAddSprinkles() ? 10 : 0) + getPackingCost() + (getBagNumber() * 0.5);
    }

    @Override
    public int getPackingCost() {
        if (isPackingBox()) {
            return (getBoxNumber() * super.getPackingCost());
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDonuts (" + getFlavor() + ") with " + (isPackingBox() ? getBoxNumber() + " Box " : "") + getBagNumber() + " Bag" +
                "\nTotal price of Donuts = " + calculateTotalPrice();
    }
}
