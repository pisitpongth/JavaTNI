public class Book {
    private String title;
    private String category;
    private double price;
    private int discountPercent;
    private Author author;

    public Book(String title, String category, double price, Author author) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = author;
    }

    public Book() {
        this.title = "";
        this.category = "";
        this.price = 0;
        this.author = null;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setDiscountPercent(int percent) {
        discountPercent = percent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public boolean isDiscountAvailable() {
        if (price >= 500) {
            return true;
        }
        return false;
    }

    public double calculateDiscountPrice() {
        return price - (price * getDiscountPercent() / 100);
    }

    public String showBookInfo() {
        return "Title   : " + getTitle() +
                "\nCategory: " + category +
                "\nPrice   : " + (isDiscountAvailable() ? calculateDiscountPrice() : price) +
                "\nAuthor  : " + author.showAuthorInfo();
    }
}
