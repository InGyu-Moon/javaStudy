package day0115;

public class Shop {
    private String productName;
    private int amount;
    private int price;

    public Shop(String productName, int amount, int price) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
