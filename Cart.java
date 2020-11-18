package Lab9;

public class Cart {
    private int bookID;
    private String title;
    private double price;
    private int qty;
    private int discount;

    public Cart() {
        this.bookID = 0;
        this.title = "";
        this.price = 0.0D;
        this.qty = 0;
        this.discount = 0;
    }

    public Cart(int bookID, String title, double price, int qty, int discount) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.qty = qty;
        this.discount = discount;
    }

    public Cart(int bookID, String title, double price, int qty) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.qty = qty;
    }

    public int getQty() {
        return this.qty;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public int getBookID() {
        return this.bookID;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return String.format("%-30d%-30s%-30.2f%-30d%-30d\n", this.bookID, this.title, this.price, this.qty, this.discount);
    }
}
