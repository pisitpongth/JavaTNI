package Customer;

public class Regular extends Customer {
    public Regular(String name, double billAmount) {
        super(name, billAmount);
    }

    @Override
    public double calculateFinalBill() {
        if (isDiscount()) {
            return getBillAmount() - (getBillAmount() * 0.05);
        }
        return getBillAmount();
    }

    public boolean isDiscount() {
        if (getBillAmount() >= 500) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString() +
                "\n" + (isDiscount() ? "You get discount 5%" : "") +
                "\nTotal price: " + calculateFinalBill();
    }
}
