package Customer;

public class Member extends Customer implements Rewardable {
    private String member_level;

    public Member(String name, double billAmount, String member_level) {
        super(name, billAmount);
        this.member_level = member_level;
    }

    @Override
    public double calculateFinalBill() {
        return getBillAmount() - (getBillAmount() * getDiscountRate());
    }

    @Override
    public double getDiscountRate() {
        if (this.member_level.equals("Gold")) {
            return 0.15;
        } else if (this.member_level.equals("Premium")) {
            return 0.20;
        }
        return 0;
    }

    @Override
    public int collectPoints() {
        return (int) (getBillAmount() / 100);
    }

    public String toString() {
        return super.toString() +
                "\nMember level: " + this.member_level + " (Discount " + getDiscountRate() + ")" +
                "\nGet Point: " + collectPoints() +
                "\nTotal price: " + calculateFinalBill();
    }
}
